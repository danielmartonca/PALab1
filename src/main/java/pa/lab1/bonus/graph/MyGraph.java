package pa.lab1.bonus.graph;

/**
 * The purpose of the class MyGraph is to create and store a random graph.
 */
public class MyGraph {
    //private static final double Decrease_Rate = 1;
    private int nrVertices;
    public Node root;

    /**
     * The constructor for the class. It initialises the memory,creates sons for the root and calls the method generate random tree for each son of the root.
     * @param maxPossibleSons the maximum number of sons to be created on for each node.
     */
    public MyGraph(int maxPossibleSons)
    {
        nrVertices=0;
        root=new Node(Integer.toString(nrVertices));

        for(int i=0;i<maxPossibleSons;i++)
        {
            nrVertices++;

            Node son=new Node(Integer.toString(nrVertices));
            root.sons.add(son);

            generateRandomTree(son, maxPossibleSons);
        }
    }

    /**
     * This function generates a random number of sons for each current node and calls itself for each son with a lower maximum number of sons to be created.
     * @param currentNode the node of which it's sons are going to be created
     * @param maxPossibleSons the maximum number of sons it can create.
     */
    private void generateRandomTree(Node currentNode,int maxPossibleSons)
    {
       // maxPossibleSons-=Decrease_Rate;
        //generate a random number of sons
        int randomNrSons=(int)(Math.random()*maxPossibleSons);

        for(int i=0;i<randomNrSons;i++)
        {
            //create sons
            nrVertices++;
            Node son=new Node(Integer.toString(nrVertices));
            //add them
            currentNode.sons.add(son);
            //call the function on the son with a lower number of maximum sons to be created
            generateRandomTree(son, randomNrSons);
        }
    }

    /**
     * Method that prints the root and calls the recursive method showTree on the root.
     */
    public void showTree()
    {
        System.out.printf("%s",root.data);
        showTree(root,"     ");
    }

    /**
     * This method prints the tree recursively. It starts with the root and goes trough every son the root has, every son each son of the root has and so on until it cant find any other sons.
     * If the current node is a leaf it prints "-" before it's date,otherwise it prints "+".
     * @param currentNode the nod of which it's sons are going to be printed and called on the function
     * @param space an informative space in order to show an correct visual representation on the console
     */
    private void showTree(Node currentNode,String space)
    {
        for(int i=0;i<currentNode.sons.size();i++) {

            Node aux=currentNode.sons.get(i);
            if(aux.sons.size()==0)
                System.out.printf("\n%s-",space);
            else
                System.out.printf("\n%s+",space);

            System.out.printf("%s",aux.data);
            showTree(aux,space+"     ");
        }

    }
}
