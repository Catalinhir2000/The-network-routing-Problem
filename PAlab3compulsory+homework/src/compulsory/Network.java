package compulsory;

import java.util.ArrayList;
import java.util.List;

public class Network {
    private List<Node> nodes = new ArrayList<>();

    public Network(List<Node> nodes) {
        this.nodes = nodes;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public void addNode (Node node) {
        nodes.add(node);
    }


//    @Override
//    public String toString() {
//        return "Network{" +
//                "nodes=" + nodes +
//                '}';
//    }
    //afisam nodurile care implementeaza idenifiabble
    public void displayIdentifiable(){
        List<Identifiable> identifiableNodes = new ArrayList<>();
        for (var node : nodes){
            if (node instanceof Identifiable){
                identifiableNodes.add((Identifiable) node);
            }
        }
        identifiableNodes.sort((node1, node2) -> node1.getAddress().compareTo(node2.getAddress()));
        System.out.println(identifiableNodes);
    }
}
