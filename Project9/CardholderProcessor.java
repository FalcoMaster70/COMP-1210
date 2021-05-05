import java.io.File;
import java.util.Comparator;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
/** 
* project10 
* @author Seth Kinsaul
* @version November 5, 2018
*/
public class CardholderProcessor {

   private Cardholder[] cObj;
   private String[] invRecords;
   
   public CardholderProcessor() {
      cObj = new Cardholder[0];
      invRecords = new String[0];
   }
   public Cardholder[] getCardholdersArray() {
      return cObj;
   }
   public String[] getInvalidRecordsArray() {
      return invRecords;
   }
   public void addCardholder(Cardholder cObjIn) {
         cObj = Arrays.copyOf(cObj, cObj.length + 1);
         cObj[cObj.length - 1] = cObjIn;

   }
   public void addInvalidRecord(String invRecordsIn) {
   invRecords = Arrays.copyOf(invRecords, invRecords.length + 1);
   invRecords[invRecords.length - 1] = invRecordsIn;
   }
   public void readCardholderFile(String dataFileIn) 
        throws FileNotFoundException {
//       Scanner scanFile = new Scanner(new File(dataFileIn));
//       Scanner scanFile2 = new Scanner(new File(dataFileIn));
//       
//       cObj = scanFile.nextLine();
//       while (scanFile.hasNext()) {
//       
//       
//       }
   }
   public String generateReport(Cardholder[] cA) {
      return "";
   }
   public String generateReportByName(Cardholder[] cA) {
   return "";
   }
   public String generateReportByCurrentBalance(Cardholder[] cA) {
      return "";
   }
   
}