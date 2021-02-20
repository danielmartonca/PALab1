package pa.lab1.bonus.bonusmain;
import pa.lab1.bonus.graph.*;

/**
 * The main class purpose is to create a random tree and print it's values based on the graphical representation given.
 * It created a tree of 5 vertexes and prints it.
 */
public class MyMain {
    public static void main(String []Args)
    {
    MyGraph tree=new MyGraph(5);
    tree.showTree();
    }
}
