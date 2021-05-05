import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


/** Tests BlueDiamondCardholer methods. */
public class BlueDiamondCardholderTest {
   private BlueDiamondCardholder bdc;

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      bdc = new BlueDiamondCardholder("11100", "Doe, John");
   }

   /** Testing to see if getDiscountRate works correctly. */
   @Test public void getDiscountRateTest() {
      Assert.assertEquals(bdc.getDiscountRate(), 0.1, .00001);
   }
   /** Testing to see if setDiscountRate works correctly. */
   @Test public void setDiscountRateTest() {
      bdc.setDiscountRate(0.7);
      Assert.assertEquals(bdc.getDiscountRate(), 0.7, .00001);
   }
   /** Testing to see if getBonusPurchasePoints works correctly. */
   @Test public void getBonusPurchasePointsTest() {
      Assert.assertEquals(bdc.getBonusPurchasePoints(), 2500, .00001);
   }
   /** Testing to see if setBonusPurchasePoints works correctly. */
   @Test public void setBonusPurchasePointsTest() { 
      bdc.setBonusPurchasePoints(2700);
      Assert.assertEquals(bdc.getBonusPurchasePoints(), 2700, .00001);
   }
   /** Testing to see if toString works correctly. */
   @Test public void toStringTest() {
      Assert.assertEquals(bdc.toString().contains("Blue " 
         + "Diamond Cardholder"), true);
      double[] purPoints = {0, 100, 5000, 10000};
      bdc.setPurchases(purPoints);
      Assert.assertEquals(bdc.toString().contains("Blue " 
         + "Diamond Cardholder"), true);
   }
   /** Testing to see if purchasePoints works correctly. */
   @Test public void purchasePointsTest() {
      double[] purPoints = {0, 2, 3};
      bdc.setDiscountRate(0.5);
      bdc.setPurchases(purPoints);
      Assert.assertEquals(12, bdc.purchasePoints());
      double[] purPoints2 = {0, 100, 5000, 10000};
      bdc.setDiscountRate(0.01);
      bdc.setPurchases(purPoints2);
      Assert.assertEquals(77245, bdc.purchasePoints());
   }
   
}

