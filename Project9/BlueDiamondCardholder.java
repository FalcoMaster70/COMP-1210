import java.text.DecimalFormat;
/** 
* project9.
* @author Seth Kinsaul
* @version November 5, 2018
*/
public class BlueDiamondCardholder extends DiamondCardholder {
   private int bonusPurchasePoints = 2500;
   
   /**
   * @param acctNumIn - first param
   * @param nameIn - second param
   */
   public BlueDiamondCardholder(String acctNumIn, String nameIn) {
      super(acctNumIn, nameIn);
      category = "Blue Diamond Cardholder";
      discountRate = 0.10;
   }
   /** 
   * @return bonusPurchasePoints
   */
   public int getBonusPurchasePoints() {
      return bonusPurchasePoints;
   }
   /** 
   * @param bonusPurchasePointsIn - first param
   */
   public void setBonusPurchasePoints(int bonusPurchasePointsIn) {
      bonusPurchasePoints = bonusPurchasePointsIn;
   }
   /** 
   * @return 0
   */
   public int purchasePoints() {
      if (totalPurchases() > 2500) {
         return (int) ((totalPurchases()) * 5 + bonusPurchasePoints);
      }
      else {
         return (int) ((totalPurchases()) * 5);
      }
   }
   /**
   * @return String
   */
   public String toString() {
      DecimalFormat formatD = new DecimalFormat("$#,##0.00");
      DecimalFormat formatP = new DecimalFormat("#,##0");
      DecimalFormat discountF = new DecimalFormat("0.0%");
      if (totalPurchases() > 2500) {
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
            + discountF.format(getDiscountRate()) + "\n(includes " 
            + " discount rate applied to New Purchases)";
      }
      else {
         return category + "\nAcctNo/Name: " + acctNum + " " + name 
            + "\nPrevious Balance: " 
            +  formatD.format(pBal) + "\nPayment: " + "(" 
            + formatD.format(payM) + ")" 
            + "\nInterest: " + formatD.format(interest()) + "\nNew Purchases: "
            + formatD.format(totalPurchases()) + "\nCurrent Balance: " 
            + formatD.format(currentBalance()) 
            + "\nMinimum Payment: " + formatD.format(minPayment()) 
            + "\nPurchase Points: " 
            + formatP.format(purchasePoints())
            + "\n(includes "
            + discountF.format(getDiscountRate()) 
            + " discount rate applied to New Purchases)";
      }
   }

}