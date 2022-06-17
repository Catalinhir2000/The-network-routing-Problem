package compulsory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Node> noduri = new ArrayList<>();
        Network nodes = new Network(noduri);

//        Node v1 = new Node("Computer A");
//        Node v2 = new Node("Router A");
//        Node v3 = new Node("Switch A");
//        Node v4 = new Node("Switch B");
//        Node v5 = new Node("Router B");
//        Node v6 = new Node("Computer B");
//        Node v7 = new Computer("B");
//
        Computer v1 = new Computer("A", "192.168");
        Router v2 = new Router("A", "192.187");
        Switch v3 = new Switch("A");
        Switch v4 = new Switch("B");
        Router v5 = new Router("B", "192.123");
        Computer v6 = new Computer("B", "192.322");

        nodes.addNode(v1);
        nodes.addNode(v2);
        nodes.addNode(v3);
        nodes.addNode(v4);
        nodes.addNode(v5);
        nodes.addNode(v6);
        //adaugam costurile
        v1.addCost(v2,10);
        v1.addCost(v3, 50);
        v2.addCost(v3, 20);
        v2.addCost(v4, 20);
        v2.addCost(v5, 20);
        v3.addCost(v4, 10);
        v4.addCost(v5, 30);
        v4.addCost(v6, 10);
        v5.addCost(v6, 20);



        var nodeList = nodes.getNodes();
        for(var n : nodeList){
            System.out.println(n.getCost());
        }

        nodes.displayIdentifiable();


    }
}
