/**
* @author Seth Kinsaul
* @version October 26, 2018
* Test each method in Icosahedron.java.
*/
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
* Test each method in Icosahedron.java.
*/
public class IcosahedronTest {
   
   private Icosahedron i;
   
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      i = new Icosahedron("Small Example", "Red Example", 7.5);
   }
 
   /** Testing to see if getLabel() works correctly. */
   @Test public void getLabel() {
      Assert.assertEquals("get label test", i.getLabel(), "Small Example");
      Assert.assertEquals(i.setLabel("Large Example"), true);
      Assert.assertEquals(i.setLabel(null), false);
   }
   /** Testing to see if getColor() works correctly. */
   @Test public void getColor() {
      Assert.assertEquals(i.getColor(), "Red Example");
      Assert.assertEquals(i.setColor("Blue Example"), true);
      Assert.assertEquals(i.setColor(null), false);
   }
   /** Testing to see if getEdge() works correctly. */
   @Test public void getEdge() {
      Assert.assertEquals(i.getEdge(), 7.5, .000001);
      Assert.assertEquals(i.setEdge(33), true);
      Assert.assertEquals(i.setEdge(-33), false);
   }
   /** Testing to see if surfaceArea() works correctly. */
   @Test public void surfaceAreaTest() {
      double sa = i.surfaceArea();
      Assert.assertEquals(i.surfaceArea(), sa, .000001);
   }
   /** Testing to see if volume() works correctly. */
   @Test public void volumeTest() {
      double v = i.volume();
      Assert.assertEquals(i.volume(), v, .000001);
   }
   /** Testing to see if surfaceToVolumeRatio() works correctly. */
   @Test public void surfaceToVolumeRatio() {
      double stvr = i.surfaceToVolumeRatio();
      Assert.assertEquals(i.surfaceToVolumeRatio(), stvr, .000001);
   }
   /** Testing to see if toString() works correctly. */
   @Test public void toStringTest() {
      boolean tString = i.toString().contains("Small Example");
      Assert.assertEquals(i.toString().contains("Small Example"), tString);
   }
   /** Testing to see if getCount() works correctly. */
   @Test public void getCountTest() {
      int count = i.getCount();
      Assert.assertEquals(i.getCount(), count, .000001);
   }
   /** Testing to see if resetCount() works correctly. */
   @Test public void resetCountTest() {
      i.resetCount();
      Assert.assertEquals(i.getCount(), 0);
   }
   /** Testing to see if equalsTest() works correctly. */
   @Test public void equalsTest() {
      Icosahedron icoObj1 = new Icosahedron("Small Example", 
         "Red Example", 7.5);
      Icosahedron icoObj2 = new Icosahedron("Small example", 
         "Red Example", 6.5);
      Icosahedron icoObj3 = new Icosahedron("Small EXAMPLE", 
         "Blue Example", 5.5);
      Icosahedron icoObj4 = new Icosahedron("SMallExample", 
         "Purple Example", 4.5);
      Assert.assertEquals(i.equals(""), false);
      Assert.assertEquals(i.equals(icoObj1), true);
      Assert.assertEquals(i.equals(icoObj2), false);
      Assert.assertEquals(i.equals(icoObj3), false);
      Assert.assertEquals(i.equals(icoObj4), false);
   }
   /** Testing to see if hashCode() works correctly. */
   @Test public void hashCodeTest() {
      Assert.assertEquals(i.hashCode(), 0, .000001);
   }
}
