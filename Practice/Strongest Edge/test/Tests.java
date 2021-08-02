import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Tests {
  private String msg = "The strongest edge found is not correct";


  @Before
  public void createGraph() {
    ForTesting.createGraphs();
  }

  @Test
  public void testGraphOne() {
    Assert.assertEquals(msg, 11, Task.strongestEdge(ForTesting.one));
  }

  @Test
  public void testGraphTwo() {
    Assert.assertEquals(msg, 6, Task.strongestEdge(ForTesting.six));
  }

  @Test
  public void testGraphThree() {
    Assert.assertEquals(msg, -5, Task.strongestEdge(ForTesting.eleven));
  }
}