package pa.lab1.compulsory;

/**
 * The scope of the class HelloWorld is to solve the tasks at the section compulsory.
 * I managed to finish all the requirements for this section.
 * Since the code is quite clear and simple, i decided it is not worth creating a JavaDoc for everything so most lines of the code will not be explained.
 */
public class HelloWorld {
    public static void main(String []args){
        System.out.println("Hello World!");
        String []languages={"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = (int) (Math.random() * 1_000_000);
        n*=3;
        n+= Integer.parseInt("10101",2);
        n+=Integer.parseInt("FF",16);
        n*=6;

        /**
         * The next loop calculates the sum of the digits of variable "n" while it has more than one digit.
         */
        while(n>=10)
        {
            /**
             * Initialise variable sum where we keep the sum of digits of the current number n.
             * Calculate the sum of digits inside the second loop.
             * The calculated sum becomes the new value of "n".
             * Check whether it is higher than 10 or not and repeat if it is the case.
             */
            int sum=0;
            while(n>0) {
            sum+=n%10;
            n/=10;
            }
            n=sum;
        }
        System.out.println("Willy-nilly, this semester I will learn " + languages[n] + '.');
    }
}
