package field;

public class BusEdgeComposition implements InterfaceEdge {
    private Edge edge;
    public BusEdgeComposition(Node firstNode, Node secondNode) {
        this.edge = new Edge(firstNode, secondNode);
    }

}
