import java.text.DecimalFormat;

/** 
* project9.
* @author Seth Kinsaul
* @version November 5, 2018
*/
public class DiamondCardholder extends Cardholder {
   protected double discountRate = 0.05;
   
   /**
   * @param acctNumIn - first param
   * @param nameIn - second param
   */
   public DiamondCardholder(String acctNumIn, String nameIn) {
      super(acctNumIn, nameIn);
      category = "Diamond Cardholder";
   }
   /** 
   * @return discountRate
   */
   public double getDiscountRate() {
      return discountRate;
   }
   /**
   * @param discountRateIn - first param
   */
   public void setDiscountRate(double discountRateIn) {
      discountRate = discountRateIn;
   }
   /**
   * @return totalPurchases
   */
   public double totalPurchases() {
      double totalPurchases = 0;
      double purch2 = 0;
      if (purch != null) {
         for (int i = 0; i < purch.length; i++) {
            purch2 = purch[i] - (purch[i] * discountRate);
            totalPurchases += purch2;
         }
      }
      return totalPurchases;
   }
   /**
   * @return int
   */
   public int purchasePoints() {
      return (int) ((totalPurchases()) * 3);
   }
   /**
   * @return String 
   */
   public String toString() {
      
      DecimalFormat formatD = new DecimalFormat("$#,##0.00");
      DecimalFormat formatP = new DecimalFormat("#,##0");
      DecimalFormat discountF = new DecimalFormat("0.0%");
      return category + "\nAcctNo/Name: " + acctNum + " " + name 
         + "\nPrevious Balance: : " 
         +  formatD.format(pBal) + "\nPayment: " + "(" 
         + formatD.format(payM) + ")" 
         + "\nInterest: " + formatD.format(interest()) + "\nNew Purchases: "
         + formatD.format(totalPurchases()) + "\nCurrent Balance: " 
         + formatD.format(currentBalance()) 
         + "\nMinimum Payment: " + formatD.format(minPayment()) 
         + "\nPurchasePoints: " 
         + formatP.format(purchasePoints())
         + "\n(includes " + discountF.format(getDiscountRate()) 
         + " discount rate "
         + "applied to New Purchases)";
   }
   
}
