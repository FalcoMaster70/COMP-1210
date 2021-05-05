/**	
*  @author Seth Kinsaul	  	
*  @version November 5, 2018 	
*  Activity 9
*/ 
public abstract class OnlineTextItem extends InventoryItem {
   
   /** 
   * @param nameIn - first param
   * @param priceIn - second param
   */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   /** 
   * @return price
   */
   public double calculateCost() {
      return price;
   }
   
}