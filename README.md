# Laboratory 1

This repository is for the tasks given an laboratory one. I managed to finish all three tasks: Optional Bonus and Compulsory

## Compulsory
The task consists of:<br />

- [x] Display on the screen the message "Hello World!". Run the application. If it works, go to step 2 :)<br />
- [x] Define an array of strings languages, containing {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"}<br />
- [x] Generate a random integer n: int n = (int) (Math.random() * 1_000_000);<br />
- [x] Compute the result obtained after performing the following calculations:<br />
 multiply n by 3;<br />
add the binary number 10101 to the result;<br />
add the hexadecimal number FF to the result;<br />
multiply the result by 6;
- [x] Compute the sum of the digits in the result obtained in the previous step. This is the new result. While the new result has more than one digit, continue to sum the digits of the result.
- [x] Display on the screen the message: "Willy-nilly, this semester I will learn " + languages[result].<br />


I ran the code using the latest version of Intellij by simply tapping the run HelloWorld.java button.<br />
Here is the output i recieved:<br />
```dif
Hello World!
Willy-nilly, this semester I will learn Java.

```
## Optional
The task consists of:<br />

- [x] Let n be an integer given as a command line argument. Validate the argument!
- [x] Create a n x n matrix, representing the adjacency matrix of a random graph .
- [x] Display on the screen the generated matrix (you might want to use the geometric shapes from the Unicode chart to create a "pretty" representation of the matrix).
- [x] Verify if the generated graph is connected and display the connected components (if it is not).
- [x] Assuming that the generated graph is connected, implement an algorithm that creates a partial tree of the graph. Display the adjacency matrix of the tree.
- [x] For larger n display the running time of the application in nanoseconds (DO NOT display the matrices). Try n > 30_000. You might want to adjust the JVM Heap Space using the VM options -Xms4G -Xmx4G.
- [ ] Launch the application from the command line, for example: java Lab1 100.
  <br /><br />I ran the code using the latest version of Intellij with the argument "10". In order to insert the argument you have to press "ALT+SHIFT+F10" and put 10 in the program arguments section.<br />
  <br />Based on the random values generated by the program, tere are two possible outputs. First consisting of something of something very
  similar to this:<br />
```dif
Vom crea un graf cu 10 noduri.
Graful este conex.
Vom genera un arbore partial al acestuia.
Reprezentarea grafica a arborelui partial este:
node0
     +node1
          +node2
               -node3
               -node4
          +node5
               +node6
                    -node7

Reprezentarea cu matrice de adiancenta este:
0 1 0 0 0 0 0 
1 0 1 0 0 1 0 
0 1 0 1 1 0 0 
0 0 1 0 0 0 0 
0 0 1 0 0 0 0 
0 1 0 0 0 0 1 
0 0 0 0 0 1 0 

Time:14347100 nanoseconds = 0.014347100000000002 seconds.

```
And the second one should look like this:
```dif
Vom crea un graf cu 10 noduri.
Graful nu este conex si are urmatoarele componente conexe:

Componenta conexa numarul 0 este fromata din: 
1 5 9 4 2 8 4 7 
Componenta conexa numarul 1 este fromata din: 
3 10 6 
Time:9538300 nanoseconds = 0.009538300000000001 seconds.


```
## Bonus
The task consists of:<br />

- [x] Implement an efficient algorithm that generates a random rooted tree. Create and display a textual representation of the tree, for example:
  <pre>
  +node0
  <br />    +node1
  <br />       -node2
  <br />    +node3
  <br />       -node4
  <br />       -node5
  </pre>


I ran the code using the latest version of Intellij with no arguments.<br />
Here is the output i recieved:<br />
```dif
node0
     +node1
          +node2
               -node3
          +node4
               -node5
          +node6
               -node7
               +node8
                    -node9
          +node10
               -node11
     +node12
          +node13
               -node14
               +node15
                    -node16
          -node17
          -node18
          -node19
     +node20
          -node21
     -node22
     +node23
          -node24
          -node25

```
