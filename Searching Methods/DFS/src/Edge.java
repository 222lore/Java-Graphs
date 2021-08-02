public class Edge {

    private Vertex vertex1, vertex2;

    public Edge(Vertex vertex1, Vertex vertex2) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
    }

    public Vertex[] getVerticies() {
        Vertex[] verticies = new Vertex[2];
        verticies[0] = vertex1;
        verticies[1] = vertex2;
        return verticies;
    }

    public String toString() {
        String out = "Edge from " + vertex1.getName() + " to " + vertex2.getName();
        return out;
    }
}
