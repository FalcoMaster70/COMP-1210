/**	
*  @author Seth Kinsaul	  	
*  @version November 5, 2018 	
*  Activity 9
*/ 
public class OnlineArticle extends OnlineTextItem {
   private int wordCount;
   
   /**
   * @param nameIn - first param
   * @param priceIn - second param
   */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   /**
   * @param wordCountIn - first param
   */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
}