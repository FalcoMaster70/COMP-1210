import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


/** Test DiamondCardholder methods. */
public class DiamondCardholderTest {
   
   private DiamondCardholder dC1;
   private DiamondCardholder dC2;
   
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      dC1 = new DiamondCardholder("10101", "Doe, John");
      dC2 = new DiamondCardholder("10001", "Young, Billy");
   }
   
   /** Testing to see if getDiscountRate works correctly. */
   @Test public void getDiscountRateTest() {
      Assert.assertEquals(dC1.getDiscountRate(), 0.05, .00001);
   
   }
   /** Testing to see if setDiscountRate works correctly. */
   @Test public void setDiscountRateTest() {
      dC1.setDiscountRate(0.9);
      Assert.assertEquals(dC1.getDiscountRate(), 0.9, .00001);
   }
   /** Testing to see if totalPurchases works correctly. */
   @Test public void totalPurchasesTest() {
      dC1.addPurchases(25.4, 4.6, 5.5);
      Assert.assertEquals(dC1.totalPurchases(), 33.725, 0.00001);
      dC1.setPurchases(null);
      Assert.assertEquals(dC1.totalPurchases(), 0, 0.00001);
   }
   /** Testing to see if purchasePoints works correctly. */
   @Test public void purchasePointsTest() {
      Assert.assertEquals(dC1.purchasePoints(), dC1.totalPurchases(), 0.00001);
   }
   /** Testing to see if toString works correctly. */
   @Test public void toStringTest() {
      Assert.assertEquals(dC1.toString().contains("Diamond "
         + "Cardholder"), true);
   
   }
}
