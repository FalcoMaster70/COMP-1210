import java.text.DecimalFormat;
import java.util.Arrays;
/** 
* project9.
* @author Seth Kinsaul
* @version November 5, 2018
*/
public abstract class Cardholder implements 
    Comparable<Cardholder>  {
   
   //instance variables 
   protected String category;
   protected String acctNum;
   protected String name;
   protected double pBal;
   protected double payM;
   protected double[] purch; 

   /** constant. */
   public static final double INTEREST_RATE = 0.01;
   
   /** 
   * @param acctNumIn - first param
   * @param nameIn - second param
   */
   public Cardholder(String acctNumIn, String nameIn) {
      acctNum = acctNumIn;
      name = nameIn;
      purch = new double[0];
   }
   /**
   * @return acctNum
   */
   public String getAcctNumber() {
      return acctNum;
   }
   /**
   * @param acctNumIn - first param
   */
   public void setAcctNumber(String acctNumIn) {
      acctNum = acctNumIn;
   }
   /**
   * @return name
   */
   public String getName() {
      return name;
   }
   /** 
   * @param nameIn - first param
   */
   public void setName(String nameIn) {
      name = nameIn;
   }
   /**
   * @return pBal
   */
   public double getPrevBalance() {
      return pBal;
   }
   /**
   * @param pBalIn - first param
   */
   public void setPrevBalance(double pBalIn) {
      pBal = pBalIn;
   }
   /**
   * @return payM
   */
   public double getPayment() {
      return payM;
   }
   /**
   * @param payMIn - first param
   */
   public void setPayment(double payMIn) {
      payM = payMIn;
   }
   /** 
   * @return purch
   */
   public double[] getPurchases() {
      return purch;
   }
   /** 
   * @param purchIn - first param
   */
   public void setPurchases(double[] purchIn) {
      purch = purchIn;
   }
   /**
   * @param purchIn - first param
   */
   public void addPurchases(double...purchIn) {
      int nPL = purchIn.length;
      int oPL = purch.length;
    
      purch = Arrays.copyOf(purch, purch.length + nPL);
      int x = 0;
      for (int y = oPL; y < purch.length; y++) {
         purch[y] = purchIn[x];
         x++;
      }
   }
   /** 
   * @param purchIn - first param
   */
   public void deletePurchases(double purchIn) { 
   
      for (int x = 0; x < purch.length; x++) {
         if (purch[x] == purchIn) {
            for (int y = x; y < purch.length - 1; y++) {
               purch[y] = purch[y + 1];
            }
            purch = Arrays.copyOf(purch, purch.length - 1);
         }
      }
   }
   /**
   * @param purchIn - first param
   */
   public void deletePurchases(double... purchIn) {
      for (double pur : purchIn) {
         deletePurchases(pur);
      }
   }
   /**
   * @return pBal, payM
   */
   public double interest() {
      return (pBal - payM) * INTEREST_RATE;
   }
   /**
   * @return totalPurchases - first param
   */
   public double totalPurchases() {
      double totalPurchases = 0;
      if (purch != null) {
         for (int i = 0; i < purch.length; i++) {
            totalPurchases += purch[i];
         }
      }
      return totalPurchases;
   }
   /**
   * @return pBal, interest(), totalPurchases()
   */
   public double balance() {
      return (pBal + interest()) + totalPurchases();
   }
   /**
   * @return pBal, payM, interest(), totalPurchases()
   */
   public double currentBalance() {
      return pBal - payM + interest() + totalPurchases();
   }
   /** 
   * @return currentBalance() 
   */
   public double minPayment() {
      return currentBalance() * 0.03;
   }
   /**
   * @return String
   */
   public String toString() {
      DecimalFormat formatD = new DecimalFormat("$#,##0.00");
      DecimalFormat formatP = new DecimalFormat("#,##0");
      return category + "\nAcctNo/Name: " + acctNum + " " + name 
         + "\nPrevious Balance: : " 
         +  formatD.format(pBal) + "\nPayment: " + "(" 
         + formatD.format(payM) + ")" 
         + "\nInterest: " + formatD.format(interest()) + "\nNew Purchases: "
         + formatD.format(totalPurchases()) + "\nCurrent Balance: " 
         + formatD.format(currentBalance()) 
         + "\nMinimum Payment: " + formatD.format(minPayment()) 
         + "\nPurchasePoints: " 
         + formatP.format(purchasePoints()); 
   }
   /**
   * Abstract has no body.
   * @return int
   */
   public abstract int purchasePoints();
   public int compareTo(Cardholder comp) {
      return name.compareToIgnoreCase(comp.getName());
   }
}