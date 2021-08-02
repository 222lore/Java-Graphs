import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Tests {
  private static String msg1 = "There is ",
  msg2 = "a path between nodes ",
  msg3 = ", so the DFS method should return ";

  @Before
  public void start() {
    Task.createGraph();
  }

  @Test
  public void testPathOnetoTwo() {
    String msg = msg1 + msg2 + "one and two" + msg3 + "true";
    Assert.assertTrue(msg, Task.depthFirstSearch(Task.one, Task.two));
  }

  @Test
  public void testPathOnetoSeven() {
    String msg = msg1 + msg2 + "one and seven" + msg3 + "true";
    Assert.assertTrue(msg, Task.depthFirstSearch(Task.one, Task.seven));
  }

  @Test
  public void testPathFivetoSix() {
    String msg = msg1 + msg2 + "five and six" + msg3 + "true";
    Assert.assertTrue(msg, Task.depthFirstSearch(Task.five, Task.six));
  }

  @Test
  public void testPathEleventoFour() {
    String msg = msg1 + "not " + msg2 + "eleven and four" + msg3 + "true";
    Assert.assertFalse(msg, Task.depthFirstSearch(Task.eleven, Task.four));
  }

  @Test
  public void testPathNinetoTen() {
    String msg = msg1 + msg2 + "nine and ten" + msg3 + "true";
    Assert.assertTrue(msg, Task.depthFirstSearch(Task.nine, Task.ten));
  }
}