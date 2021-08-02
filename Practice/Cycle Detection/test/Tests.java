import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Tests {
  String returnedTrue = "Your method returned true (said that there is a cycle in the graph), " +
          "when it should return false";
  String returnedFalse = "Your method returned false (said that there is not a cycle in the graph), " +
          "when it should return true";

  @Before
  public void setupGraphs() {
    ForTesting.createGraphs();
  }

  @Test
  public void testGraphOneVOne() {
    Assert.assertFalse(returnedTrue, Task.cycleSearch(ForTesting.one));
  }

  @Test
  public void testGraphOneVSeven() {
    Assert.assertFalse(returnedTrue, Task.cycleSearch(ForTesting.one));
  }
  @Test
  public void testGraphTwoVEight() {
    Assert.assertFalse(returnedFalse, Task.cycleSearch(ForTesting.one));
  }

  @Test
  public void testGraphOneVTen() {
    Assert.assertFalse(returnedFalse, Task.cycleSearch(ForTesting.one));
  }

  @Test
  public void testGraphThreeVTwelve() {
    Assert.assertFalse(returnedTrue, Task.cycleSearch(ForTesting.twelve));
  }
}