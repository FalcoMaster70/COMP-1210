/**	
*  @author Seth Kinsaul	  	
*  @version November 5, 2018 	
*  Activity 9
*/ 
public class OnlineBook extends OnlineTextItem {
   protected String author;
   
   /** 
   * @param nameIn - first param
   * @param priceIn - second param 
   */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   /**
   * @return name, author, price
   */
   public String toString() {
      return name + " - " + author + ": $" + price;
   }
   /**
   * @param authorIn 
   */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
}