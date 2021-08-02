import java.util.ArrayList;

public class Task {

    public static void main(String[] args) {}

    public static int strongestEdge(Vertex root) {
        return strongestEdge(root, -Integer.MAX_VALUE, new ArrayList<Vertex>());
    }

    private static int strongestEdge(Vertex root, int strongest, ArrayList<Vertex> visited) {
        visited.add(root);

        int edgeWeight;
        for (Edge connection: root.getEdges()) {
            edgeWeight = connection.getWeight();
            if (edgeWeight > strongest) strongest = edgeWeight;
        }

        ArrayList<Vertex> children = root.getChildrenDirected();
        for (Vertex child: children) {
            if (visited.contains(child)) continue;
            return (strongestEdge(child, strongest, visited));
        }

        return strongest;
    }
}