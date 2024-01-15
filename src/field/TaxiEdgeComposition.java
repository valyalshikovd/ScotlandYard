package field;

public class TaxiEdgeComposition implements InterfaceEdge {
    private Edge edge;
    public TaxiEdgeComposition(Node firstNode, Node secondNode) {
        this.edge = new Edge(firstNode, secondNode);
    }
}
