public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!!");
    }
    /*  Lab week 04: Classroom tasks:
    Task 01) Run the following code: */

    void countDown(int num) {
        if (num == 0) // test
            System.out.println("Blastoff!");
        else {
            System.out.println("...");
            countDown(num-1); // recursive call
        }
    }

    /* what is the output of this code?

        The program will be a countdown from the input number to 0, followed by the message "Blastoff!"

        For Example of we call countDown(3);
        We should get :

        ...
        ...
        ...
        Blastoff!

        - modify it so that it prints only the even numbers.

        Modified code is*/

        static void countDownModified(int num) {

            if (num == 0)   {
                System.out.println("Blastoff!");
            }   else if (num % 2 == 0) {
                System.out.println(num);
                countDownModified(num-1);
            } else {
                System.out.println("...");
                countDownModified(num-1);// recursive call
            }
        }


        /*- what is the time complexity of this algorithm and why?
        The time complexity of this algorithm is O(n), where n is the input number.
        This is because the function is called recursively n times.


    Task 02) Run the following code: */

    int gcd(int x, int y) {

        if (x % y == 0) //base case

            return y;

        else

            return gcd(y, x % y);

    }

    /*what is the output of this code?

    The output of this code is the Greatest common divisor of 2 numbers.
    If we call gcd(45, 35) the output would be 5.

     - modify it to find the gcd using subtraction instead of %.
      The modified code is:
     */

    static int gcdModified(int x, int y) {
        if (x % y == 0){    //base case
            return y;
        }   else    {
            if (x == y){
                return x;
            }   else if (x > y) {
                return gcdModified(x - y, y);
            }   else    {
                return gcdModified(x, y - x);
            }
        }
    }


    //Task 03) Run the following code:


    int fib(int n)

    {

        if (n <= 0) // base case

            return 0;

        else if (n == 1) // base case

            return 1;

        else

            return fib(n - 1) + fib(n - 2);

    }

    /* what is the time complexity of this algorithm and why?
    The time complexity of the given algorithm is O(2^n), where n is the input parameter.
    This is because the function makes two recursive calls for each call that is not a base case.*/

}