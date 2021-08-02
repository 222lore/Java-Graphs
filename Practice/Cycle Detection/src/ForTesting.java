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

        one.addEdge(two); one.addEdge(three);
        two.addEdge(four); two.addEdge(seven);
        three.addEdge(six);
        four.addEdge(five);

        eight.addEdge(nine); eight.addEdge(ten);
        eleven.addEdge(nine); eleven.addEdge(ten);
    }
}
