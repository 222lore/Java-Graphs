import java.util.ArrayList;

public class Vertex {

    private String name;
    private ArrayList<Edge> edges = new ArrayList<>();

    public Vertex(String name) {
        this.name = name;
    }

    public void addEdgeDirected(Vertex vertex2, int weight) {
        Edge connection = new Edge(this, vertex2, weight);
        edges.add(connection);
    }

    public ArrayList<Vertex> getChildrenDirected() {
        ArrayList<Vertex> children = new ArrayList<>();
        for (Edge connection: edges) {
            Vertex toAdd = connection.getVerticies()[1];
            children.add(toAdd);
        }

        return children;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public String toString() {
        String out = "Vertex: " + name + "\nChildren: ";
        for (int i = 0; i < getChildrenDirected().size(); i++) {
            Vertex vertex = getChildrenDirected().get(i);
            if (i == getChildrenDirected().size()-1) out += vertex.getName();
            else out += vertex.getName() + ", ";
        }
        return out;
    }
}