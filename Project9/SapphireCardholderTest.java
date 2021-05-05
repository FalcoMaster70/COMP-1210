import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


/** Test methods in SapphireCardholder. */
public class SapphireCardholderTest {
   
   private SapphireCardholder sc;
   
   
   /** Create SapphireCardholder object. */
   @Before public void setUp() {
      sc = new SapphireCardholder("10003", "Debt, Johnny");
   }


   /** Testing to see if purchasePoints works correctly. */
   @Test public void purchasePointsTest() {
      Assert.assertEquals(sc.purchasePoints(), sc.totalPurchases(), 0.00001);
   }
   //test methods for cardholer.java
   /** Testing to see if getAcctNumber works correctly. */
   @Test public void getAcctNumberTest() {
      Assert.assertEquals(sc.getAcctNumber(), "10003");
      sc.setAcctNumber("10007");
      Assert.assertEquals(sc.getAcctNumber(), "10007");
   }
   /** Testing to see if getName works correctly. */
   @Test public void getNameTest() {
      Assert.assertEquals(sc.getName(), "Debt, Johnny");
      sc.setName("Jo, Billy");
      Assert.assertEquals(sc.getName(), "Jo, Billy");
   }
   /** Testing to see if getPrevBalance works correctly. */
   @Test public void getPrevBalanceTest() {
      Assert.assertEquals(sc.getPrevBalance(), 0, 0.00001);
      sc.setPrevBalance(400);
      Assert.assertEquals(sc.getPrevBalance(), 400, 0.00001);
   } 
   /** Testing to see if getPayment works correctly. */
   @Test public void getPayment() {
      Assert.assertEquals(sc.getPayment(), 0, 0.00001);
      sc.setPayment(500);
      Assert.assertEquals(sc.getPayment(), 500, 0.00001);
   }
   /** Testing to see if getPurchases works correctly. */
   @Test public void getPurchasesTest() {
      double[] gP = sc.getPurchases();
      Assert.assertEquals(sc.getPurchases(), gP);
   //sc.setPurchases();
      Assert.assertEquals(sc.getPurchases(), gP);
   }
   /** Testing to see if addPurchases works correctly. */
   @Test public void addPurchasesTest() {
      sc.addPurchases(25.4, 4.6, 5.5);
      Assert.assertEquals(sc.totalPurchases(), 35.5, 0.00001);
   }
   /** Testing to see if deletePurchases works correctly. */
   @Test public void deletePurchasesTest() {
   
   }
   /** Testing to see if interest works correctly. */
   @Test public void interestTest() {
      sc.setPayment(500);
      sc.setPrevBalance(700);
      Assert.assertEquals(sc.interest(), 2, 0.00001);
   }
   /** Testing to see if totalPurchases works correctly. */
   @Test public void totalPurchasesTest() {
      sc.addPurchases(25.4, 4.6, 5.5);
      Assert.assertEquals(sc.totalPurchases(), 35.5, 0.00001);
      sc.setPurchases(null);
      Assert.assertEquals(sc.totalPurchases(), 0, 0.00001);
   }
   /** Testing to see if balance works correctly. */
   @Test public void balanceTest() {
      sc.setPayment(500);
      sc.setPrevBalance(700);
      Assert.assertEquals(sc.balance(), 702, 0.00001);
   }
   /** Testing to see if currentBalance works correctly. */
   @Test public void currentBalanceTest() {
      sc.setPayment(500);
      sc.setPrevBalance(700);
      Assert.assertEquals(sc.currentBalance(), 202, 0.00001);
   }
   /** Testing to see if minPayment works correctly. */
   @Test public void minPaymentTest() {
      sc.setPayment(500);
      sc.setPrevBalance(700);
      Assert.assertEquals(sc.minPayment(), 6.06, 0.00001);
   }
   @Test public void toStringTest() {
   
   }   
}
