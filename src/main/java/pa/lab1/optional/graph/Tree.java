package pa.lab1.optional.graph;

import java.util.Arrays;

/**
 * The class Tree role is to store a partial tree created based on a graph.
 * The class stores the the root of the tree and it's adjency matrix.
 * It has methods to print the tree under graphical form or to print out it's adjency matrix.
 */
public class Tree {
    private final Node root;
    private int[][] adjencyMatrix;

    /**
     * Constructor for Tree and getter for root
     */
    public Tree() {
        root = new Node("0");
    }

    public  Node getRoot()
    {
        return root;
    }

    /**
     * Method that prints out an informative message and calls the other method with parameter root and an starting space
     */
    public void showTreeGraphically() {
        System.out.printf("Reprezentarea grafica a arborelui partial este:\n%s", root.getData());
        showTreeGraphically(root, "     ");
    }

    /**
     * This method prints the tree recursively. It starts with the root and goes trough every son the root has, every son each son of the root has and so on until it cant find any other sons.
     * If the current node is a leaf it prints "-" before it's date,otherwise it prints "+".
     * @param currentNode the nod of which it's sons are going to be printed and called on the function
     * @param space an informative space in order to show an correct visual representation on the console
     */
    private void showTreeGraphically(Node currentNode, String space) {

        //go trough each son
        for (int i = 0; i < currentNode.getSons().size(); i++) {

            Node aux = currentNode.getSons().get(i);
            if (aux.getSons().size() == 0)
                System.out.printf("\n%s-", space);
            else
                System.out.printf("\n%s+", space);

            System.out.printf("%s", aux.getData());
            showTreeGraphically(aux, space + "     ");
        }

    }

    /**
     * Method to initialise the adjency matrix with -1 in every position
     * @param nrVerticesTree the number of vertices the will have
     */
    private void initialiseMatrix(int nrVerticesTree) {
        adjencyMatrix = new int[nrVerticesTree + 1][nrVerticesTree + 1];
        for (int i = 0; i < nrVerticesTree; i++)
            Arrays.fill(adjencyMatrix[i], 0);
    }

    /**
     * This method calculates the adjency matrix recursively. It starts with root and goes through each son it has and so on and uses the digits at the end of data.
     * @param currentNode the current node of which it's sons will be used to calculate the adjency matrix.
     */
    private void calculateMatrix(Node currentNode) {
        int pos1 = Integer.parseInt(currentNode.getData().substring(4));
        for (Node x : currentNode.getSons()) {
            int pos2 = Integer.parseInt(x.getData().substring(4));

            //node pos1 will be linked to node pos2
            adjencyMatrix[pos1][pos2] = adjencyMatrix[pos2][pos1] = 1;
            calculateMatrix(x);
        }
    }

    /**
     * This method prints the ajency matrix of the tree. It first initialises the matrix and calculates it, then prints it to the screen.
     * @param nrVerticesTree the number of vertices in the tree
     */
    public void showMatrix(int nrVerticesTree) {
        initialiseMatrix(nrVerticesTree);
        calculateMatrix(root);

        System.out.print("\n\nReprezentarea cu matrice de adiancenta este:\n");
        for (int i = 0; i < nrVerticesTree; i++) {
            for (int j = 0; j < nrVerticesTree; j++)
                System.out.printf("%d ", adjencyMatrix[i][j]);

            System.out.print("\n");
        }
    }
}
