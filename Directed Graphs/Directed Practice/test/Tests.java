import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Tests {

  @Before
  public void Start() {
    ForTesting.createGraph();
  }

  @Test
  public void testOne() {
    String actual = "Vertex: four\n" +
            "Children: one, five";
    String msg = "Check your Vertex toString method";
    Assert.assertEquals(msg, ForTesting.testOne(), actual);
  }

  @Test
  public void testTwo() {
    String actual = "Vertex: three\n" +
            "Children: ";
    String msg = "Check your Vertex toString method";
    Assert.assertEquals(msg, ForTesting.testTwo(), actual);
  }

  @Test
  public void testThree() {
    String actual = "[Edge from five to three with a weight of 1]";
    String msg = "Check your Vertex getEdges method";
    Assert.assertEquals(msg, ForTesting.testThree(), actual);
  }

  @Test
  public void testFour() {
    String actual = "[Edge from four to one with a weight of 6, Edge from four to five with a weight of 7]";
    String msg = "Check your Vertex getEdges method";
    Assert.assertEquals(msg, ForTesting.testFour(), actual);
  }
}