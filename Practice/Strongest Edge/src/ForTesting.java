import java.util.ArrayList;

public class ForTesting {
    static Vertex one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve;
    public static void main(String[] args) {
    }

    public static void createGraphs() {
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
        twelve = new Vertex("twelve");

        one.addEdgeDirected(two, 5);
        two.addEdgeDirected(four, 10);
        four.addEdgeDirected(one, 6); four.addEdgeDirected(five, 7);
        five.addEdgeDirected(three, 11);

        six.addEdgeDirected(eight, 1);
        eight.addEdgeDirected(nine, 5); eight.addEdgeDirected(ten, 2);
        nine.addEdgeDirected(seven, 6);
        seven.addEdgeDirected(six, 4); seven.addEdgeDirected(ten, 3);

        eleven.addEdgeDirected(twelve, -5);
    }
}
