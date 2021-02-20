package pa.lab1.optional.graph;

import java.util.Arrays;
import java.util.LinkedList;

public class MyGraph {

    private final int nrVerticesGraph;
    private int[][] adjencyMatrix;

    private LinkedList<Integer>[] conexComponents_List;
    private int nrConexComponents;

    private Tree partialTree;
    private int nrVerticesTree;

    private MyGraph() {
        nrVerticesGraph = 0;
    }

    public MyGraph(int inputVertices) {
        this.nrVerticesGraph = inputVertices;
        adjencyMatrix = new int[nrVerticesGraph][nrVerticesGraph];

        nrConexComponents = 0;
        conexComponents_List = new LinkedList[nrVerticesGraph];

        for (int i = 0; i < nrVerticesGraph; i++) {
            Arrays.fill(adjencyMatrix[i], -1);
            conexComponents_List[i] = new LinkedList<Integer>();
        }

        partialTree = new Tree();
        nrVerticesTree = 0;
    }

    public void generateRandomGraph() {
        for (int i = 0; i < nrVerticesGraph; i++)
            for (int j = 0; j < nrVerticesGraph; j++)
                if (adjencyMatrix[i][j] == -1)
                    if (i != j && Math.random() >= 0.85)
                        adjencyMatrix[i][j] = adjencyMatrix[j][i] = 1;
                    else
                        adjencyMatrix[i][j] = adjencyMatrix[j][i] = 0;
    }

    public boolean checkConexity() {
        for (int i = 0; i < nrVerticesGraph; i++)
            for (int j = 0; j < nrVerticesGraph; j++)
                if (adjencyMatrix[i][j] == 1) {
                    nrConexComponents++;
                    conexComponents_List[nrConexComponents - 1].add(i + 1);
                    dfs(i, partialTree.getRoot());
                    break;
                }
        if (nrConexComponents != 1) {
            partialTree = null;
            return false;
        }
        return true;
    }

    private void dfs(int i, Node Parent) {
        for (int j = 0; j < nrVerticesGraph; j++)
            if (adjencyMatrix[i][j] == 1) {
                adjencyMatrix[i][j] = adjencyMatrix[j][i] = 0;
                conexComponents_List[nrConexComponents - 1].add(j + 1);

                nrVerticesTree++;
                Node son = new Node(Integer.toString(nrVerticesTree));
                Parent.getSons().add(son);

                dfs(j, son);
            }
    }

    public void printConexComponents() {
        for (int i = 0; i < nrConexComponents; i++) {
            System.out.println("\nComponenta conexa numarul " + i + " este fromata din: ");
            for (int x : conexComponents_List[i])
                System.out.printf("%d ", x);
        }

    }

    public void printTreeGraphically() {
        partialTree.showTreeGraphically();
    }

    public void printTreeMatrix() {
        partialTree.showMatrix(nrVerticesTree);
    }
}