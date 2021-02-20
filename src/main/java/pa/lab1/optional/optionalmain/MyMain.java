package pa.lab1.optional.optionalmain;

import pa.lab1.optional.graph.*;

/**
 * The scope of the class MyMain is to solve the tasks at the section optional.
 * I managed to finish all the requirements for this section.
 * In order to run the code correctly, the user needs to have an integer greater than 0 as a command line argument
 */
public class MyMain {
    public static void main(String[] args) {
        long start = System.nanoTime();

        /**
         * Checks whether the program has an argument or not.
         */
        if (args.length != 1)
            System.err.println("Numar invalid de argumente inserate de la tastatura");
        else
            System.out.println("Vom crea un graf cu " + args[0] + " noduri.");

        int nrVertices = Integer.parseInt(args[0]);
        /**
         * Check whether that argument is an positive integer or not.
         */
        if(nrVertices<=0)
            System.err.println("Nu puteti crea un graf cu " + nrVertices + " noduri.");

        /**
         * 1. Create a new random graph.
         * 2. Checks convexity, calculates conex components and an potential partial tree if it exists (else null).
         * 3. Based on the value of the function checkConexity:
         *   - if it returned a TRUE shows the partial tree graphically and his adjency matrix
         *   - if it returned a FALSE prints out the conex components under an number list form.
         * 4. Shows the time it took for the algorithm to finish in nanoseconds and seconds.
         */
        MyGraph graph1 = new MyGraph(nrVertices);

        graph1.generateRandomGraph();

        if (graph1.checkConexity()) {
            System.out.println("Graful este conex.\nVom genera un arbore partial al acestuia.");
            graph1.printTreeGraphically();
            graph1.printTreeMatrix();
        } else {
            System.out.println("Graful nu este conex si are urmatoarele componente conexe:");
            graph1.printConexComponents();
        }

        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println("\nTime:" + timeElapsed + " nanoseconds = " + timeElapsed * Math.pow(10, -9) + " seconds.");
    }
}




 