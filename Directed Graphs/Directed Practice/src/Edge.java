public class Edge {

    private Vertex vertex1, vertex2;
    private int weight;
    
    public Edge(Vertex vertex1, Vertex vertex2, int weight) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.weight = weight;
    }

    public Vertex[] getVerticies() {
        Vertex[] verticies = new Vertex[2];
        verticies[0] = this.vertex1;
        verticies[1] = this.vertex2;
        return verticies;
    }

    public int getWeight() {
        return this.weight;
    }

    public String toString() {
        String out = "Edge from " + vertex1.getName() + " to " + vertex2.getName() + " with a weight of " + weight;
        return out;
    }
}
