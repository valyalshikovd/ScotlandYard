package field;

public class Edge implements InterfaceEdge{
    private Node firstNode;
    private Node SecondNode;

    public Edge(Node firstNode, Node secondNode) {
        this.firstNode = firstNode;
        SecondNode = secondNode;
    }
}
