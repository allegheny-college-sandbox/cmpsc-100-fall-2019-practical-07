package fractions;

import java.text.NumberFormat;

/** Manages creation of Fractions and their centiles.
 *
 * @author Douglas Luman
 */
public class Fraction {
  
  public final int numer;
  public final int denom;
  
  /** Constructor.
   *
   * @param numer Numerator
   * @param denom Denominator
   */
  public Fraction(int numer, int denom) {
    this.numer = numer;
    this.denom = denom;
  }
  
  /** Creates a fraction with 100 as denominator.
   *
   */
  public Fraction centile() {
    int numer = (this.numer * 100) / this.denom;
    Fraction centile = new Fraction(numer,100);
    return centile;
  }
  
  /** Formats the fraction as a percentage.
   *
   */
  public String fmtPercent() {
    NumberFormat fmt = NumberFormat.getPercentInstance();
    fmt.setMinimumFractionDigits(1);
    double quotient = (double)this.numer / (double)this.denom;
    return fmt.format(quotient);
  }
  
  /** Creates the String form of a fraction.
   *
   */
  public String toString() {
    String fraction = this.numer + "/" + this.denom;
    return fraction;
  }
    
}