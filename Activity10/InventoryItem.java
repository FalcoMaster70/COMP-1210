/**	
*  @author Seth Kinsaul	  	
*  @version November 5, 2018 	
*  Activity 9
*/ 
public class InventoryItem {
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
  /**
  * CONSTRUCTOR.
  * @param nameIn - first param
  * @param priceIn - second param
  */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   /**
   * @return name
   */
   public String getName() {
      return name;
   }
   /**
   * @return price, taxRate
   */
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   /**
   * @param taxRateIn - first param
   */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   /**
   * @return name, calculateCost()
   */
   public String toString() {
      return name + ": $" + calculateCost();
   }
   
}