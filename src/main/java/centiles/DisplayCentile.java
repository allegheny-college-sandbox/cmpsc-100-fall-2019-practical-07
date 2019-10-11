package fractions;

import java.util.Scanner;

/** Creates fractions, displays as centiles.
 *
 * @author Douglas Luman
 */
public class DisplayCentile {
  
  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter points earned: ");
    int earned = input.nextInt();
    System.out.print("Enter points possible: ");
    int possible = input.nextInt();
    Fraction score = new Fraction(earned, possible);
    Fraction centile = score.centile();
    System.out.println("Score " + score.toString() + " = "
                       + centile.toString() + " (" + centile.fmtPercent() + ")");
  }
}