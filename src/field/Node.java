package field;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private List<InterfaceEdge> edges = new ArrayList<>();

    public Node(List<InterfaceEdge> edges) {
        this.edges = edges;
    }
    public void addEdge(Edge edge){
        edges.add(edge);
    }

}
