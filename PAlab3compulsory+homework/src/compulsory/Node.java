package compulsory;

import java.util.HashMap;
import java.util.Map;

public class Node {
    private String name;
    private Map<Node, Integer> cost = new HashMap<>();


    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Node, Integer> getCost() {
        return cost;
    }

    public void setCost(Map<Node, Integer> cost) {
        this.cost = cost;
    }
    //adaugam costurile in map
    public void addCost(Node nod, Integer valoare){
        this.cost.put(nod, valoare);
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
