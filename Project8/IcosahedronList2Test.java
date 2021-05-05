import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;
/**
*  @author Seth Kinsaul	  	
*  @version November 2, 2018
*  use methods to return the summary info 
*  of the icosahedrons that were called in Icosahedron file
*/
/** Testing methods for IcosahedronList2. */
public class IcosahedronList2Test {
      
   private IcosahedronList2 i;
   private Icosahedron[] icoList2;

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      icoList2 = new Icosahedron[5];
      icoList2[0] = new Icosahedron("Small Example", "Red Example", 2.5);
      icoList2[1] = new Icosahedron("Medium Example", "Blue Example", 4.5);
      icoList2[2] = new Icosahedron("Large Example", "Green Example", 5.5);
      icoList2[3] = new Icosahedron(null, null, 0.0);  
      i = new IcosahedronList2("Icosahedron Test List", icoList2, 4);
   }
   /** Testing to see if getName works correctly. */
   @Test public void getNameTest() {
      Assert.assertEquals("Icosahedron Test List", i.getName());
   }
   /** Testing to see if numberOfIcosahedrons works correctly. */
   @Test public void numberOfIcosahedronsTest() {
      IcosahedronList2 nullL = new IcosahedronList2("Empty test list", null, 0);
      Assert.assertEquals(4, i.numberOfIcosahedrons());
      Assert.assertEquals(0, nullL.numberOfIcosahedrons());
   }
   /** Testing to see if totalSurfaceArea works correctly. */
   @Test public void totalSurfaceAreaTest() {
      double surfaceArea = i.totalSurfaceArea();
      Assert.assertEquals(i.totalSurfaceArea(), surfaceArea, .000001);
   }
   /** Testing to see if totalVolume works correctly. */
   @Test public void totalVolumeTest() {
      double volume = i.totalVolume();
      Assert.assertEquals(i.totalVolume(), volume, .000001);
   }
   /** Testing to see if averageSurfaceArea works correctly. */
   @Test public void averageSurfaceAreaTest() {
      double averageSurfaceArea = i.averageSurfaceArea();
      IcosahedronList2 nullL = new IcosahedronList2("Empty test list", null, 0);
      Assert.assertEquals(i.averageSurfaceArea(), averageSurfaceArea, .000001);
      Assert.assertEquals(nullL.averageSurfaceArea(), 0, .000001);
   }
   /** Testing to see if averageVolume works correctly. */
   @Test public void averageVolumeTest() {
      double averageVolume = i.averageVolume();
      IcosahedronList2 nullL = new IcosahedronList2("Empty test list", null, 0);
      Assert.assertEquals(i.averageVolume(), averageVolume, .000001);
      Assert.assertEquals(nullL.averageVolume(), 0, .000001);
   }
   /** Testing to see if averageSurfaceToVolumeRatio works correctly. */
   @Test public void averageSurfaceToVolumeRatioTest() {
      double averageSTVR = i.averageSurfaceToVolumeRatio();
      IcosahedronList2 nullL = new IcosahedronList2("Empty test list", null, 0);
      Assert.assertEquals(i.averageSurfaceToVolumeRatio(), 
         averageSTVR, .000001);
      Assert.assertEquals(nullL.averageSurfaceToVolumeRatio(), 0, .000001);
   }
   /** Testing to see if toStringTest works correctly. */
   @Test public void toStringTest() {
      boolean hasString = i.toString().contains("Icosahedron Test List");
      Assert.assertEquals(i.toString().contains("Icosahedron Test List"), 
         hasString);
   }
   /** Testing to see if summaryInfo works correctly. */
   @Test public void summaryInfoTest() {
      Assert.assertEquals(i.summaryInfo().contains("Icosahedron Test List"),
          true);
      
   }
   /** Testing to see if getList works correctly. */
   @Test public void getListTest() {
      Icosahedron[] getList = i.getList();
      Assert.assertArrayEquals(i.getList(), getList);
   }
   /** Testing to see if readFile works correctly. 
   * @throws FileNotFoundException - IO not found 
   */
   @Test public void readFileTest() throws FileNotFoundException {
      i.readFile("icosahedron_data_1.txt");
      Assert.assertEquals("Icosahedron Test List", i.getName());
   }
   /** Testing to see if addIcosahedron works correctly. */
   @Test public void addIcosahedronTest() {
      i.addIcosahedron("New Example", "Purple Example", 4);
      Assert.assertEquals(i.toString().contains("New Example"), true);
      Assert.assertEquals(i.toString().contains("blah"), false);
   
   }
   /** Testing to see if findIcosahedron works correctly. */
   @Test public void findIcosahedronTest() {
      Icosahedron find = new Icosahedron("Small Example", "Red Example", 2.5);
      Assert.assertEquals(i.findIcosahedron("Small Example"), find);
      Assert.assertEquals(i.findIcosahedron("Not Here"), null);
   }
   /** Testing to see if deleteIcosahedron works correctly. */
   @Test public void deleteIcosahedronTest() {
      Icosahedron delete = new Icosahedron("Small Example", "Red Example", 2.5);
      Assert.assertEquals(i.deleteIcosahedron("Small Example"), delete);
      Assert.assertEquals(i.deleteIcosahedron("Not an Example"), null);
   }
   /** Testing to see if editIcosahedron works correctly. */
   @Test public void editIcosahedronTest() {
      Assert.assertEquals(i.editIcosahedron("Small Example", "Red Example", 
         4.5), true);
      Assert.assertEquals(i.editIcosahedron("Doesn't Exist", "Red Example", 
         4.5), false);
   }
   /** Testing to see if findIcosahedronWithShortestEdge 
   * works correctly. */
   @Test public void findIcosahedronWithShortestEdgeTest() {
      IcosahedronList2 nullL = new IcosahedronList2("Empty test list", null, 0);
      Assert.assertEquals(i.findIcosahedronWithShortestEdge(), 
         i.findIcosahedron("Small Example"));
      i.addIcosahedron("N Example", "Blue Example", 0.5);
      Assert.assertEquals(i.findIcosahedronWithShortestEdge(),
         i.findIcosahedron("N Example"));
      Assert.assertEquals(nullL.findIcosahedronWithShortestEdge(), null);
   }
   /** Testing to see if findIcosahedronWithLongestEdge 
   * works correctly. */
   @Test public void findIcosahedronWithLongestEdgeTest() {
      IcosahedronList2 nullL = new IcosahedronList2("Empty test list", null, 0);
      Assert.assertEquals(i.findIcosahedronWithLongestEdge(), 
         i.findIcosahedron("Large Example"));
      Assert.assertEquals(nullL.findIcosahedronWithLongestEdge(), null);
      i.addIcosahedron("N Example", "Gray Example", 40.7);
      Assert.assertEquals(i.findIcosahedronWithLongestEdge(),
         i.findIcosahedron("N Example"));
   }
   /** Testing to see if findIcosahedronWithSmallestVolume
   *  works correctly. */
   @Test public void findIcosahedronWithSmallestVolumeTest() {
      IcosahedronList2 nullL = new IcosahedronList2("Empty test list", 
         null, 0);
      Assert.assertEquals(i.findIcosahedronWithSmallestVolume(),
          i.findIcosahedron("Small Example"));
      Assert.assertEquals(nullL.findIcosahedronWithSmallestVolume(), null);
      i.addIcosahedron("N Example", "Gray Example", 0.4);
      Assert.assertEquals(i.findIcosahedronWithSmallestVolume(),
         i.findIcosahedron("N Example"));
   }
   /** Testing to see if findIcosahedronWithLargestVolume
   *  works correctly. */
   @Test public void findIcosahedronWithLargestVolumeTest() {
      IcosahedronList2 nullL = new IcosahedronList2("Empty test list", 
         null, 0);
      Assert.assertEquals(i.findIcosahedronWithLargestVolume(), 
         i.findIcosahedron("Large Example"));
      i.addIcosahedron("N Example", "Gray Example", 20.5);
      Assert.assertEquals(nullL.findIcosahedronWithLargestVolume(), null);
      Assert.assertEquals(i.findIcosahedronWithLargestVolume(),
         i.findIcosahedron("N Example"));
   }

}
