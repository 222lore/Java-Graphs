public class Edge {

    private final Vertex vertex1, vertex2;

    public Edge(Vertex vertex1, Vertex vertex2) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
    }

    public Vertex[] getVertices() {
        Vertex[] vertices = new Vertex[2];
        vertices[0] = vertex1;
        vertices[1] = vertex2;
        return vertices;
    }

    public String toString() {
        String out = "Edge from " + vertex1.getName() + " to " + vertex2.getName();
        return out;
    }
}
