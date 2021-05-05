import java.util.Comparator;
/** 
* project10 
* @author Seth Kinsaul
* @version November 5, 2018
*/
public class CurrentBalanceComparator implements Comparator<Cardholder> {
   
    public int compare(Cardholder c1, Cardholder c2) {
    if (c1.currentBalance() < c2.currentBalance()) {
         return -1;
      }
      else if (c1.currentBalance() > c2.currentBalance()) {
         return 1;
      }
      else {
         return 0;
      }
      }
}