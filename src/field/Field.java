package field;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<Node> nodes = new ArrayList<>();

    public void createField(String filename) {
        try {
            Path input = Paths.get(filename);
            BufferedReader reader = Files.newBufferedReader(input);

            String[] topLine = reader.readLine().split(" ");
            int countOfNodes = Integer.parseInt(topLine[0]);
            int countOfEdges = Integer.parseInt(topLine[1]);

            addNodes(countOfNodes);

            for (int i = 0; i < countOfEdges; i++) {
                String line = reader.readLine();
                if (line.isEmpty()) continue;
                addEdge(line);
            }
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }

    private void addEdge(String line) throws IOException {
        String[] parts = line.split(" ");
        String data = null;
        Node n1 = null;
        Node n2 = null;

        try {
            data = String.valueOf(parts[2]);
            n1 = nodes.get(Integer.parseInt(parts[0]) - 1);
            n2 = nodes.get(Integer.parseInt(parts[1]) - 1);
        } catch (IllegalArgumentException e) {
            throw new IOException("Error reading graph. Cannot create edge for line: " + line);
        }

        switch (data) {
            case "Bus" -> {
                BusEdgeComposition edge1 = new BusEdgeComposition(n1, n2);
                n1.addEdge(edge1);
                BusEdgeComposition edge2 = new BusEdgeComposition(n2, n1);
                n2.addEdge(edge2);
            }
            case "Taxi" -> {
                TaxiEdgeComposition edge1 = new TaxiEdgeComposition(n1, n2);
                n1.addEdge(edge1);
                TaxiEdgeComposition edge2 = new TaxiEdgeComposition(n2, n1);
                n2.addEdge(edge2);
            }
            case "Underground" -> {
                UndergroundEdgeComposition edge1 = new UndergroundEdgeComposition(n1, n2);
                n1.addEdge(edge1);
                UndergroundEdgeComposition edge2 = new UndergroundEdgeComposition(n2, n1);
                n2.addEdge(edge2);
            }
            case "Boat" -> {
                BoatEdgeComposition edge1 = new BoatEdgeComposition(n1, n2);
                n1.addEdge(edge1);
                BoatEdgeComposition edge2 = new BoatEdgeComposition(n2, n1);
                n2.addEdge(edge2);
            }
            default -> throw new IOException();
        }

//        if (n1 == null || n2 == null) {
//            if (n1 == null) System.err.println("Error reading graph. Cannot find node: " + parts[1]);
//            if (n2 == null) System.err.println("Error reading graph. Cannot find node: " + parts[2]);
//            System.exit(1);
//        }
    }

    private void addNodes(int countOfNodes) {
        for (int i = 0; i < countOfNodes; i++) {
            Node node = new Node();
            nodes.add(node);
        }
    }
}
