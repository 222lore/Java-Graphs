import java.util.ArrayList;

public class Task {
    public static Vertex one, two, three, four, five, six, seven, eight, nine, ten, eleven;

    public static void main(String[] args) {
    }

    public static boolean breadthFirstSearch(Vertex start, Vertex end) {
        return (breadthFirstSearch(start, end, new ArrayList<Vertex>(), new ArrayList<Vertex>()));
    }

    private static boolean breadthFirstSearch(Vertex start, Vertex end, ArrayList<Vertex> queue, ArrayList<Vertex> visited) {
        if (start.equals(end)) return true;
        visited.add(start);

        ArrayList<Vertex> children = start.getChildren();
        for (Vertex child: children) {
            queue.add(child);
        }

        for (int i = 0; i < queue.size(); ) {
            Vertex childInQueue = queue.get(i);
            queue.remove(i);
            if (visited.contains(childInQueue)) continue;
            if (breadthFirstSearch(childInQueue, end, queue, visited)) return true;
        }
        return false;
    }

    // Create graph here
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

        one.addEdge(two); one.addEdge(three);
        two.addEdge(five); two.addEdge(seven);
        eight.addEdge(seven);
        three.addEdge(five); three.addEdge(eight);
        four.addEdge(five); four.addEdge(six);
        five.addEdge(six);

        nine.addEdge(ten); nine.addEdge(eleven);
    }

}