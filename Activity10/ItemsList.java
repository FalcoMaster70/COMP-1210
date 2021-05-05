/**	
*  @author Seth Kinsaul	  	
*  @version November 5, 2018 	
*  Activity 9
*/ 
public class ItemsList { 
   
   private InventoryItem[] inventory;
   private int count;
   
   /**
   * No parameter args - no param args used.
   */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0; 
   }
   /**
   * @param itemIn - first param
   */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   /**
   * @return output
   */
   public String toString() {
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      return output;
   }
   /**
   * @param electronicsSurcharge - first param
   * @return total
   */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         } 
      }
      return total;
   }
   
}