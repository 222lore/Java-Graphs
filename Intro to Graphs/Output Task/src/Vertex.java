import java.util.ArrayList;

public class Vertex {

    private final String name;
    private ArrayList<Edge> edges = new ArrayList<>();

    public Vertex(String name) {
        this.name = name;
    }

    public void addEdge(Vertex vertex2) {
        addEdge(vertex2, false);
    }

    private void addEdge(Vertex vertex2, boolean secondHandle) {
        Edge connection = new Edge(this, vertex2);
        edges.add(connection);

        if (!secondHandle) vertex2.addEdge(this, true);
    }

    public ArrayList<Vertex> getChildren() {
        ArrayList<Vertex> children = new ArrayList<>();
        for (Edge connection: edges) {
            Vertex[] vertices = connection.getVertices();
            Vertex toAdd = this.equals(vertices[0]) ? vertices[1]:vertices[0];
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
        for (int i = 0; i < getChildren().size(); i++) {
            Vertex vertex = getChildren().get(i);
            if (i == getChildren().size()-1) out += vertex.getName();
            else out += vertex.getName() + ", ";
        }
        return out;
    }
}
