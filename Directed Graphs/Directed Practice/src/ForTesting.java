import java.util.ArrayList;

public class ForTesting {
    static Vertex one, two, three, four, five;
    public static void main(String[] args) {
    }

    public static void createGraph() {
        one = new Vertex("one");
        two = new Vertex("two");
        three = new Vertex("three");
        four = new Vertex("four");
        five = new Vertex("five");

        one.addEdgeDirected(two, 5);
        two.addEdgeDirected(four, 10);
        four.addEdgeDirected(one, 6);
        four.addEdgeDirected(five, 7);
        five.addEdgeDirected(three, 1);
    }

    public static String testOne() {
        return four.toString();
    }
    public static String testTwo() {
        return three.toString();
    }
    public static String testThree() {
        return five.getEdges().toString();
    }
    public static String testFour() {
        return four.getEdges().toString();
    }
}
