public class FibonacciRecursive {
    public static void main(String[] args) {
        int n = fib(6);
        System.out.println(n);
    }

    //0 1 1 2 3 5 8 13

    /*
    We can create a recursive tree by dividing the problem into sub-problems that are similar.

    Suppose there is a function fib(n) which gives the nth fibonacci number of the fibonacci series,
    and we know that fib(n) = fib(n-1) + fib(n-2).

    We can make a recursive tree out of this whose leaf nodes will be either fib(0) or fib(1)
    as they are the base conditions.

    Recursive tree for fib(4):-
                          fib(4)
               fib(3)                 fib(2)
         fib(2)      fib(1)     fib(1)      fib(0)
    fib(1)   fib(0)

    The function gets terminated at base condition which is fib(0) and fib(1).
    */

    public static int fib(int index){
        //Base conditions
        //Given fib(0)=0
        if(index==0){
            return 0;
        }
        //Given fib(1)=1
        if(index==1){
            return 1;
        }
        //Recursive call as fib(n) = fib(n-1) + fib(n-2).
        return fib(index-1)+fib(index-2);
    }
}
