import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {}

    public static boolean cycleSearch(Vertex root) {
        return cycleSearch(root, null, new ArrayList<Vertex>());
    }

    private static boolean cycleSearch(Vertex root, Vertex old, ArrayList<Vertex> visited) {
        visited.add(root);

        ArrayList<Vertex> children = root.getChildren();
        for (Vertex child: children) {
            if (child.equals(old)) continue;

            if (visited.contains(child)) return true;
            else if (cycleSearch(child, root, visited)) return true;
        }

        return false;
    }
}