/**.
*   @author Seth Kinsaul
    @version August 30, 2018
* the program is meant to manipulate integers
*/
import java.util.Scanner;
public class AgeStatistics {
/**.
 * @param args command line arguments - not used.
 */
   public static void main(String [] args) {
   //string arguments are addresssed//
   Scanner userInput = new Scanner(System.in);
   String name = "";
   int ageInYears = 0;
   int gender= 0; 
   double maxHeartRate = 0;
   
   //prompt the user for their name:
   System.out.print("Enter your name: ");
   name = userInput.nextLine();
   //prompt the user for their age:
   System.out.print("Enter your age in years: ");
   ageInYears = userInput.nextInt();
   //maxHeartRate is calculated
   double maxHeartRate_females = 209 - (0.7 * ageInYears);
   double maxHeartRate_males = 214 - (0.8 * ageInYears);
   //prompt the user for their gender
   System.out.print("Enter your gender (1 for female and 0 for male):");
   gender = userInput.nextInt();
   //convert age in minutes:
   System.out.println("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
   //convert age in centuries:
   System.out.println("\tYour age in centuries is "
         + (double) ageInYears / 100 + " Centuries.");
   //display max heart rate
   System.out.print("your max heart rate is ");
   if (gender == 1) { //calculate femaleMHR
   maxHeartRate = maxHeartRate_females;
   }
   else { //calculate male MHR
   maxHeartRate = maxHeartRate_males;
   }
   System.out.println(maxHeartRate + " beats per minute.");
   }
}
