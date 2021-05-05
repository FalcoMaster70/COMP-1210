/**	
*  @author Seth Kinsaul	  	
*  @version November 5, 2018 	
*  Activity 9
*/ 
/**
* extend InventoryItem.
*/
public class ElectronicsItem extends InventoryItem {
   
   /** constant variable. */ 
   public static final double SHIPPING_COST = 1.5;
   /** protected variable. */ 
   protected double weight;
   
   /**
   * @param nameIn - first param
   * @param priceIn - second param
   * @param weightIn - third param 
   */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   /** 
   * @return calculateCost(), SHIPPING_COST, weight
   */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }

}