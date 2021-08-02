import java.util.ArrayList;

public class Task {
    public static Vertex one, two, three, four, five, six, seven, eight, nine, ten, eleven;

  public static void main(String[] args) {
  }

  public static boolean depthFirstSearch(Vertex start, Vertex end) {
      return (depthFirstSearch(start, end, new ArrayList<Vertex>()));
  }

  private static boolean depthFirstSearch(Vertex start, Vertex end, ArrayList<Vertex> visited) {
      if (start.equals(end)) return true;
      visited.add(start);
      ArrayList<Vertex> children = start.getChildren();
      for (Vertex child : children) {
          if (visited.contains(child)) continue;
          if (depthFirstSearch(child, end, visited)) return true;
      }
      return false;
  }

  // Graph created here
  public static void createGraph() {
      one = new Vertex("one");
      two = new Vertex("two");
      three = new Vertex("three");
      four = new Vertex("four");
      five = new Vertex("five");
      six = new Vertex("six");
      seven = new Vertex("seven");
      eight = new Vertex("eight");
      nine = new Vertex("nine");
      ten = new Vertex("ten");
      eleven = new Vertex("eleven");

      one.addEdge(two); one.addEdge(three); one.addEdge(four);
      two.addEdge(six); two.addEdge(seven); two.addEdge(five);
      three.addEdge(four); three.addEdge(five);
      four.addEdge(five);
      five.addEdge(seven);

      eight.addEdge(nine); eight.addEdge(ten);
      ten.addEdge(eleven);
  }
}