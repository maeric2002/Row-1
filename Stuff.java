// Example class for Git exercise
// Do not use library functions for any of these

util.ArrayList;

public class Stuff {

    // Returns the Fibonnaci sequence's nth number
    // ex. 1, 1, 2, 3, 5, 8 - 2 would be the third number
    static int fib(int n);

    ArrayList<int> fibs = new ArrayList<int>;
    fibs.add(1);
    do

    {
        int currentSize = fibs.size();
        int x = 0;
        if (fibs.get(fibs.size() - 2) != null)
            x = fibs.get(fibs.size() - 2);
        fibs.add(fibs.get(fibs.size() - 1) + x);
    } while(n >fibs[fibs.size()-1]);
    return fibs.get(fibs.size()-1);

    // Sorts a list of integers from smallest to largest
    // Build your own - don't use a library sorting method
    static int[] sort(int[] a);

    // Returns the number of occurances of each letter (ABCD...) in a given string
    static int[] letterCount(String s);

    // Returns the GCD of two numbers
    // Must use Euclid's algorithm
    static int gcd(int a, int b) {
        if (b <= a && (a % b == 0)) {
            return b;
        } else if (a < b) {
            return gcd(b, a);
        } else {
            return gcd(b, a % b);
        }
    }

    // Returns all prime factors of a number
    static int[] factorize(int a);

}
