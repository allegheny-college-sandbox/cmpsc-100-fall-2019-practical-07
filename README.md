# CMPSC 100-03 Practical Session 7

This practical will deepen your code reading and implementation skills by creating fractions and performing operations with them as `objects` with properties specific to given `instances`.

* Assigned: Friday, 11 October 2019
* Due: Friday, 18 October 2019
* Point value: 20 points

# General guidelines for practical sessions

* **Experiment!** We design practical sessions to create a space for you to _try things_. Given the expertise of our classroom TLs and my interest in fixing stuff, I am sure that even if something breaks, we can fix it.
* **Complete _something_.** Grading for practical assignments hinges on _completion_. As long as you provide a good faith effort to finish a task, your grade should reflect your effort.
* **Practice skills.** If you work in the discipline of computer science, many of the skills you revisit or establish here are industry standard practice. Learning and practicing them often helps prepare you for either other classes or professional work.
* **Try to finish during the class session** While I provide extra time to complete the work, these assignments can be completed in 50 minutes. This will help you develop your awareness and management of time.
* **Help one another!** We're a community of users here, not competitors. If you grasp something quickly, but a neighbor does not, offer to help them after they've tried for a bit. Conversely, _ask for help_ from either me, our lab TLs, or your neighbor.

## Table of Contents

* [Cloning your repository](#cloning-your-repository)
* [Slack](#slack)
* [Github](#github)
* [Making the grade](#making-the-grade)
* [GatorGrader](#gatorgrader)
* [`commit` your work](#commit-your-work)

## Cloning your repository

- [ ] Open a terminal window. Keep this window open during all of today's assignment.
- [ ] Add your SSH key to your terminal session so that you can prove your identity to GitHub.
- [ ] In your terminal window, type `eval "$(ssh-agent -s)"` and press `Enter` to start the SSH Agent `process`
- [ ] Next, add your key. Type `ssh-add ~/.ssh/id_rsa`
* You may need to provide your password.

## Slack

Before beginning the practical session, log into our shared [Slack](https://cmpsc100Fall2019.slack.com) workspace and navigate to the `#practicals` channel. Remain in this channel for the duration of the session to accept the assignment and ask and answer questions.

## GitHub

An individualized version of this assignment is available on our GitHub Classroom platform. The link for accepting your individual repository is in the `#practicals` channel of our [Slack](#slack).

## Making the Grade

Our wizard friend has some trouble: his last hat cost him quite a bit of money, and he needs to make some more quickly because his personal need for new, stylish wizard hats is overwhelming. Hat-buying addiction aside, G. Wiz has started moonlighting as an adjunct instructor at the local wizard college.

Excited to get to work, he sent out his first assignment to his students (they had to conjure colorful feathers for all the new hats he plans on buying), but has no idea how to score them! He originally set up the assignment as `9` points, and the first one he looks at recieved `11` points out of the `12` total. (It clashed too much with his favorite color--blue--but was still a pretty quality color.)

He'll need to do this again in the future, so help him create a calculator that can work for all of his current and future assignments!

G. Wiz needs your help to figure out how to:

* Represent scores as a number out of 100.
* Calculate the percentage.
* Display the original score, the "centile" (number out of 100), and the final percentage point.

A final note: the school scores everything as an `integer`, so a 91.1% should be a 91%.

## Required Deliverables

`DisplayCentile.java`

- [ ] Builds
- [ ] Runs
- [ ] Requests an `int` representing points earned (numerator)
* Create this as identifier `earned`
- [ ] Requests an `int` representing points possible (denominator)
* Create this as identifier `possible`
- [ ] Creates a `Fraction` representing this ratio
- [ ] Creates a new `Fraction` representing the score out of 100 points
- [ ] Displays output in the following fashion:
```
Score 11/12 = 91/100 (91.0%)
```
* Hint: the above uses a predefined method (`fmtPercent()`) in Fraction.java to create percents, but it might be broken!


`Fraction.java`

- [ ] Builds
- [ ] Runs
- [ ] Contains a new method titled `centile` which:
* Converts scores to a number out of 100
* Returns this score as a `Fraction`, itself
- [ ] Fixes the error in the `fmtPercent()` method
* You may need to run the program to spot it!
- [ ] Implements a `toString()` method to return fractions in the `numerator/denominator` `String` format

## Keep in mind

* `Fraction` is a `reference type` -- consult our class activity for 9 October (and the [accompanying slides])https://github.com/allegheny-college-cmpsc-100-fall-2019/course-materials/blob/master/Presentations/CMPSC%20100%20-%20Fall%202019%20-%20Week%206%20-%209%20October.pdf)
* Keep in mind that division between `int` types and `double` types differs in how numbers are represented.

### Testing your project

Use `gradle -q --console plain run` to test your program. I will use 11 points earned out of 12 points possible to test using the grader, and will use a secret test case when you submit it.

## GatorGrader

### Docker `container`

If you do not already have the GatorGrader `container`, in a new terminal or Docker Quickstart Terminal, type `docker pull gatoreducator/dockagator` to download the correct `container`.

In the last lab session, we were able to get Docker `container` versions of GatorGrader working! That means that everyone can choose to use the `container` if they'd like. Here are a couple of ways to do it:

#### Running GatorGrader directly on `container` start

* Be sure that you are in the main directory of your practicals repository when running these commands, or you'll certainly experience issues!
* Remember that if you run `ls -la`, you should see a `.git` folder if you're in the main repository folder.
* To make sure you're in the right repository, run a `pwd` command.
    * If you recieve the expected path, you're in the right place. Else, find your way to the right location.

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator
```

#### Run `gradle` commands in the container

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator /bin/bash
```

- [ ] To `build` your Java work, type `gradle build` at the `command` prompt and press the `Enter` key.
- [ ] To `grade` your Java work, type `gradle grade` at the `command` prompt and press the `Enter` key.

### Using `gradle` commands directly

- [ ] In a terminal, ensure you're in the main folder of your practical repository and type `gradle build`
- [ ] After the `command` completes successfully, type `gradle grade`

## `commit` your work

When you've finished your work: remember that there are three (3) steps to submitting a `git` repository: to "pack," to "label," and to "ship."

* Note: attempt all of these from the main directory of the repository.

- [ ] To "pack" the submission: `git add .`
- [ ] To "label" the submission: `git commit -m "{ADD MESSAGE DESCRIPTING PURPOSE OF COMMIT HERE}"`
- [ ] To "ship" the submission: `git push`
