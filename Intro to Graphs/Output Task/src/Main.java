public class Main {
   public static void main(String[] args) {
      // Creating Vertex objects
      Vertex zero = new Vertex("zero");
      Vertex one = new Vertex("one");
      Vertex two = new Vertex("two");
      Vertex three = new Vertex("three");
      Vertex four = new Vertex("four");
      Vertex five = new Vertex("five");
      Vertex six = new Vertex("six");
      Vertex seven = new Vertex("seven");
      Vertex eight = new Vertex("eight");

      // Creating edges
      zero.addEdge(one);
      zero.addEdge(three); zero.addEdge(eight);
      one.addEdge(seven);
      two.addEdge(three); two.addEdge(five); two.addEdge(seven);
      three.addEdge(four);
      four.addEdge(eight);
      five.addEdge(six);

      // Answers
      System.out.println(four); // FOR QUESTION 1
      System.out.println(six); // FOR QUESTION 2
      System.out.println("3"); // FOR QUESTION 3
      System.out.println("3"); // FOR QUESTION 4
      System.out.println(seven.getChildren()); // FOR QUESTION 5

   }
}