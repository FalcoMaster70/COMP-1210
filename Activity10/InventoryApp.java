/**	
*  @author Seth Kinsaul	  	
*  @version November 5, 2018 	
*  Activity 9
*/
public class InventoryApp {
   /**
   * prints four items.
   * @param args - no args used.
   */
   public static void main(String [] args) {
      
      InventoryItem.setTaxRate(0.05);
      InventoryItem item1 = new InventoryItem("Oil change kit", 39.00);
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80.00, 1.8);
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50);
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item3.setWordCount(700);
      item4.setAuthor("L. G. Jones");
      
      System.out.println(item1);
      System.out.println(item2);
      System.out.println(item3);
      System.out.println(item4);
   
   }
}