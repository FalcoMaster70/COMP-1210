import java.util.Scanner;
import java.io.File;
import java.text.DecimalFormat;
import java.io.FileNotFoundException;
/**
*  @author Seth Kinsaul	  	
*  @version September 17, 2018
*  use methods to return the summary info 
*  of the icosahedrons that were called in Icosahedron file
*/
public class IcosahedronList2 {
   //instance variables
   private String icoList;
   private Icosahedron[] icoObjs;
   private int numberOfIcosahedrons;
   /** 
   * constructor.
   * @param icoListIn - first param
   * @param icoObjsIn - second param
   * @param numberOfIcosahedronsIn - third param
   */
   public IcosahedronList2(String icoListIn, Icosahedron[] icoObjsIn,
      int numberOfIcosahedronsIn) {
      icoList = icoListIn;
      icoObjs = icoObjsIn;
      numberOfIcosahedrons = numberOfIcosahedronsIn;
   }
   //methods
   /**
   * returns String - the name of the list,
   * which is icosahedron test list.
   * @return icoList
   */
   public String getName() {
      return icoList;
   }
   /**
   * returns int - the number of icosahedrons.
   * @return isoobjs.size()
   */
   public int numberOfIcosahedrons() {
      return numberOfIcosahedrons;
   }
   /**
   * returns double - total surface area for
   * all icosahedrons objects in the list.
   * @return tsa
   */
   public double totalSurfaceArea() {
      double tsa = 0;
      int index = 0;
      while (index < numberOfIcosahedrons) {
         tsa += icoObjs[index].surfaceArea();  
         index++;
      }
      return tsa;
   }
   /**
   * returns double - total volume for 
   * all icosahedrons objects in the list
   * as a double.
   * @return total
   */
   public double totalVolume() {
      double total = 0;
      int index = 0;
      while (index < numberOfIcosahedrons) {
         total += icoObjs[index].volume();  
         index++;
      }
   
      return total;
   }
   /**
   * returns double - average surface area for
   * all icosahedron objects in the list.
   * @return avgSa
   */
   public double averageSurfaceArea() {
      double avgSa = 0;
      if (numberOfIcosahedrons > 0) {
         avgSa = totalSurfaceArea() / numberOfIcosahedrons;
      }
      return avgSa;
   }
   /**
   * returns double - average volume for
   * all icosahedron objects in the list.
   * @return avgV
   */
   public double averageVolume() {
      double avgV = 0;
      if (numberOfIcosahedrons > 0) {
         avgV = totalVolume() / numberOfIcosahedrons;
      }
      return avgV;
   }
   /**
   * returns double - averageSurfaceToVolumeRatio for
   * all icosahedron objects in the list.
   * @return avgR
   */
   public double averageSurfaceToVolumeRatio() {
      double avgR = 0;
      int index = 0;
      while (numberOfIcosahedrons > index) {
         avgR += icoObjs[index].surfaceToVolumeRatio();
         index++;
      }
      if (avgR != 0) {
         return avgR / numberOfIcosahedrons;
      }
      return avgR;
   }
   /**
   * returns String - with the name of the list
   * then each icosahedron in the array list.
   * @return output
   */
   public String toString() {
      String output = icoList + "\n";
      int index = 0;
      while (index < numberOfIcosahedrons) {
         output += "\n" + icoObjs[index] + "\n";
         index++;
      }
      return output;
   }
   /**
   * returns a String - contains the name of the list
   * with all the summary output lines that use all the methods above.
   * @return result
   */
   public String summaryInfo() {
      //use constructor to create a decimal format for the methods
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----"; 
      result += "\nNumber of Icosahedrons: " + numberOfIcosahedrons();
      result += "\nTotal Surface Area: " + df.format(totalSurfaceArea()); 
      result += "\nTotal Volume: "  + df.format(totalVolume());
      result += "\nAverage Surface Area: "  + df.format(averageSurfaceArea());
      result += "\nAverage Volume: "  + df.format(averageVolume());
      result += "\nAverage Surface/Volume Ratio: "  
         + df.format(averageSurfaceToVolumeRatio());
      
      return result;
   }
   
   //NEW METHODS
   /**
   * @return icoList
   */
   public Icosahedron[] getList() {
      return icoObjs;
   }
   /**
   * @param fileNameIn - first param
   * @return iL
   * @throws FileNotFoundException if the file cannot be opened.
   */
   public IcosahedronList2 readFile(String fileNameIn) 
      throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      Icosahedron[] myIcosahedron = new Icosahedron[100];
      int numIcosahedrons = 0;
      String setLabel, setColor;
      double setEdge;
   
      icoList = scanFile.nextLine(); 
   
      while (scanFile.hasNext()) {
      
         setLabel = scanFile.next();
         setColor = scanFile.next();
         setEdge = Double.parseDouble(scanFile.next());
         Icosahedron i = new Icosahedron(setLabel, setColor, setEdge);
         myIcosahedron[numIcosahedrons] = i;
         numIcosahedrons++;
      }
      IcosahedronList2 iL = new IcosahedronList2(icoList, myIcosahedron, 
         numIcosahedrons);
      
      return iL;
   
   }
    /**
    * @param cIn - first param 
    * @param lIn - second param
    * @param eIn - third param
    */
   public void addIcosahedron(String lIn, String cIn, double eIn) {
   
      Icosahedron x = new Icosahedron(lIn, cIn, eIn); 	
      icoObjs[numberOfIcosahedrons] = x;  	
      numberOfIcosahedrons++;
   }
   	  	/**
    * @param labelIn - first param  	
    * @return null	  	
    */
   public Icosahedron findIcosahedron(String labelIn) {
      for (int i = 0; i < numberOfIcosahedrons; i++) {  	
         if (icoObjs[i].getLabel().equalsIgnoreCase(labelIn)) {  	
            return icoObjs[i];  	
         }	  	
      }	  	
      return null;	  	
   }    
   /**
    * @param labelIn - first param
    * @return true
    */
   public Icosahedron deleteIcosahedron(String labelIn) { 	
      int delete = 0;  	
      Icosahedron result = null;	  	
      for (int i = 0; i < numberOfIcosahedrons; i++) {	  	
         if (icoObjs[i].getLabel().equalsIgnoreCase(labelIn)) {	  	
            result = icoObjs[i];	  	
            delete = i;	  	
         }	  	
      }	  	
      if (result != null) {	  	
         for (int i = delete; i < numberOfIcosahedrons - 1; i++) {	  	
            icoObjs[i] = icoObjs[i + 1];	  	
         }  	
         icoObjs[numberOfIcosahedrons - 1] = null;  	
         numberOfIcosahedrons--; 	
      }  	
      return result; 	
   }
   /**	  	
    * @param label - first param	
    * @param color - second param
    * @param edge - third param  	
    * @return String  	
    */
   public boolean editIcosahedron(String label, String color, 
      double edge) {  	
      label = label.trim();  	
      color = color.trim();  	
      for (int i = 0; i < numberOfIcosahedrons; i++) {	  	
         if (label.equalsIgnoreCase(icoObjs[i].getLabel())) {	  	
            icoObjs[i].setColor(color);  	
            icoObjs[i].setEdge(edge);	  	
            return true;	  	
         }	  	
      }	 	
      return false;	  	
   }
   /**
   * @return shortestEdge
   */
   public Icosahedron findIcosahedronWithShortestEdge() {
      Icosahedron shortestEdge = null;
      if (icoObjs != null) {
         shortestEdge = icoObjs[0];
         for (int i = 0; i < numberOfIcosahedrons; i++) {
            if (icoObjs[i].getEdge() < shortestEdge.getEdge()) {
               shortestEdge = icoObjs[i];
            }
            i++;
         }
      }
      return shortestEdge;
            
   }
   /** 
   * @return LongestEdge
   */
   public Icosahedron findIcosahedronWithLongestEdge() {
      Icosahedron longestEdge = null;
      if (icoObjs != null) {
         longestEdge = icoObjs[2];
         for (int i = 0; i < numberOfIcosahedrons; i++) {
            if (icoObjs[i].getEdge() > longestEdge.getEdge()) {
               longestEdge = icoObjs[i];
            }
            i++;
         }
      }
      return longestEdge;
   }
   /**
   * @return smallestVolume
   */
   public Icosahedron findIcosahedronWithSmallestVolume() {
      Icosahedron smallestVolume = null;
      if (icoObjs != null) {
         smallestVolume = icoObjs[0];
         for (int i = 0; i < numberOfIcosahedrons; i++) {
            if (icoObjs[i].getEdge() < smallestVolume.getEdge()) {
               smallestVolume = icoObjs[i];
            }
            i++;
         }
      }
      return smallestVolume;
   }
   /**
   *@return largestVolume
   */
   public Icosahedron findIcosahedronWithLargestVolume() {
      Icosahedron largestVolume = null;
      if (icoObjs != null) {
         largestVolume = icoObjs[2];
         for (int i = 0; i < numberOfIcosahedrons; i++) {
            if (icoObjs[i].getEdge() > largestVolume.getEdge()) {
               largestVolume = icoObjs[i];
            }
            i++;
         }
      }
      return largestVolume;
   }
   
}