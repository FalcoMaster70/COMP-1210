import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class CardholderProcessorTest {
   
   private CardholderProcessor cPS;
   private CardholderProcessor cPS2;
   private Cardholder p;
   private Cardholder p2;

   @Before public void setUp() {
   cPS = new CardholderProcessor();
   cPS2 = new CardholderProcessor();
   }

   @Test public void getCardholdersArrayTest() {
   Assert.assertArrayEquals(cPS.getCardholdersArray(), cPS.getCardholdersArray());
   }
   @Test public void getInvalidRecordsArrayTest(){
   Assert.assertEquals(cPS.getInvalidRecordsArray(), cPS.getInvalidRecordsArray());
   }
   @Test public void addCardholderTest() {
   cPS.addCardholder(p);
   cPS2.addCardholder(p2);
   Assert.assertArrayEquals(cPS.getCardholdersArray(), cPS2.getCardholdersArray());
   }
   @Test public void addInvalidRecordTest() {
   
   }
   @Test public void generateReportTest() {
   
   }
   @Test public void generateReportByCurrentBalanceTest() {
   
   }

}
