/** 
* project9.
* @author Seth Kinsaul
* @version November 5, 2018
*/
public class SapphireCardholder extends Cardholder {
   
   
   /**
   * @param acctNumIn - first param
   * @param nameIn - second param
   */
   public SapphireCardholder(String acctNumIn, String nameIn) {
      super(acctNumIn, nameIn);
      category = "Sapphire Cardholder";
   }
   /**
   * @return int
   */
   public int purchasePoints() {
      return (int) totalPurchases();
   }
}