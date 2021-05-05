import java.text.NumberFormat;  
import java.text.DecimalFormat;	
/**	
*  @author Seth Kinsaul	  	
*  @version September 17, 2018 	
*  This program is designed to create a Icosahedron object  	
*  with label, color, and edges  	
*/  	
public class Icosahedron {  	
/**.  	
* @param args command line arguments - not used.	  	
* initialize instance variables  	
*/ 	  	
   private String label = "";	  	
   private String color = "";	  	
   private double edge = 0; 	  	
   private static int count = 0;
    	  	
    //constructor	  	
    /** 	  	
    * @param labelIn - first param  	
    * @param colorIn - second param  	
    * @param edgeIn - third param  	
    * use constructor to create isoahedron objects	  	
    */  	
   public Icosahedron(String labelIn, String colorIn, double edgeIn) {	  	
      setLabel(labelIn);	  	
      setColor(colorIn);	  	
      setEdge(edgeIn);
      count++;  	
   }   	
    //methods  	
    /**  	
    * no paramaters and returns String.  	
    * @return label	  	
    */	  	
   public String getLabel() {	  	
      return label;	  	
   }	  	
    /**  	
    * takes a string and returns a boolean true or false.  	
    * @param labelIn - first param  	
    * @return true  	
    */  	
   public boolean setLabel(String labelIn) {	  	
      if (labelIn != null) {	  	
         label = labelIn.trim();  	
         return true;  	
      }  	
       //else return false
      else {  	
         return false;  	
      }        	
   }  	
    /**  	
    * no paramters and returns a String.	  	
    * @return color  	
    */  	
   public String getColor() {	  	
      return color;  	
   }  	
    /**  	
   * no parameters and returns a boolean true or false.	  	
    * @param colorIn - first param	  	
    * @return true  	
    */  	
   public boolean setColor(String colorIn) {  	
      if (colorIn != null) {  	
         color = colorIn.trim();	  	
         return true;	  	
      }  	
       //else return false  	
      else {  	
         return false;  	
      }  	
   }	  	
    /**	  	
    * no paramters and returns a double.	  	
    * @return edge	  	
    */	  	
   public double getEdge() {	  	
      return edge;	  	
   }  	
    /**	  	
    * accepts a double parameter and reutrns a	  	
    * a boolean true or false.	  	
    * @param edgeIn - first param  	
    * @return true  	
    */  	
   public boolean setEdge(double edgeIn) { 	  	
      if (edgeIn > 0) {	  	
         edge = edgeIn; 	
         return true;	  	
      }	  	
       //else return false	  	
      else {	  	
         return false;	  	
      }	  	
   }	  	
    /**	  	
    * no parameters and returns a double.	  	
    * @return sf	  	
    */	  	
   public double surfaceArea() {	  	
      double sfa = 5 * Math.sqrt(3) * Math.pow(edge, 2);	  	
      return sfa;	  	
   }  	
    /**   	
    * no paramters and returns a double.  	
    * @return vol  	
    */  	
   public double volume() {  	
      double volum = ((5 * (3 + Math.sqrt(5)) * Math.pow(edge, 3)) / 12);  	
      return volum;  	
   }  	
    /**  	
    * no parameters and returns a double. 	
    * surfacearea/volume 	
    * @return stvr  	
    */  	
   public double surfaceToVolumeRatio() {	  	
      double stvr = surfaceArea() / volume();	  	
      return stvr;  	
   }  	
    /**  	
    * no paramters and returns string.  	
    * uses operater 'new' to create the decimalformat  	
    * @return str 	
    */ 	
   public String toString() {  	
      NumberFormat df = new DecimalFormat("#,##0.0#####"); 	
      String str = "Icosahedron \"" + label + "\" is \"" + color	  	
          + "\" with 30 edges of length " + edge 
          + " units.\n\tsurface area = " 	  	
          + df.format(surfaceArea()) + " square units\n\tvolume = "  	
          + df.format(volume()) + " cubic units\n\tsurface/volume ratio = "  	
          + df.format(surfaceToVolumeRatio());  	
      return str;  	
   }  
   /**
   * gets the count value.
   * @return count
   */
   public static int getCount() {
      return count;
   }	
   /**
   * resets count value
   * no param - no param args used.
   */
   public static void resetCount() {
      count = 0;
   }
   /**
   * compares object using boolean returns.
   * @param obj - first param
   * @return true, false
   */
   public boolean equals(Object obj) {
      
      if (!(obj instanceof Icosahedron)) {
         return false;
      }
      else {
         Icosahedron i = (Icosahedron) obj;
         return (label.equalsIgnoreCase(i.getLabel())
                  && color.equalsIgnoreCase(i.getColor())
                  && Math.abs(edge - i.getEdge()) < .000001);
      }
   }
   /**
   * @return 0
   */
   public int hashCode() {
      return 0;
   }
}