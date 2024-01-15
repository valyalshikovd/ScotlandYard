package field;

public class BoatEdgeComposition implements InterfaceEdge {
    private Edge edge;
    public BoatEdgeComposition(Node firstNode, Node secondNode) {
        this.edge = new Edge(firstNode, secondNode);
    }
}
