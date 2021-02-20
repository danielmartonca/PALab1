package pa.lab1.optional.graph;

import java.util.LinkedList;

/**
 * Class Node is used in order to create a tree.
 * The member "data" represents the value to be stored in each node (it is of form "node" + an integer OR "?" if no integer is specified.
 * The member "sons" represents a list of nods which are directly linked to the current node.
 * The class has two getter for "data" and "sons" respectively.
 */
public class Node {
    private String data;
    private LinkedList<Node> sons;

    public Node() {
        data = "+node?";
        sons = new LinkedList<Node>();
    }

    public Node(String value) {
        data = "node" + value;
        sons = new LinkedList<Node>();
    }

    public String getData() {
        return data;
    }

    public LinkedList<Node> getSons() {
        return sons;
    }
}
