package field;

public class UndergroundEdgeComposition implements InterfaceEdge {
    private Edge edge;

    public UndergroundEdgeComposition(Node firstNode, Node secondNode) {
        this.edge = new Edge(firstNode, secondNode);
    }

}
