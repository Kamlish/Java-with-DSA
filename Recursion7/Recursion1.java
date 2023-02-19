package JavaWithDSA.Recursion7;

public class Recursion1 {

    public static void printSum(int n, int m, int sum){

        if (n==m){
            sum +=n;
            System.out.println(sum);
            return;
        }
        sum += n;
        printSum(n+1,m,sum);

    }

    public static int fact(int n){
        if (n==1 || n==0){
            return 1;
        }

        return n * fact(n-1);
    }

    public static void fibonacci(int a, int b, int n ){

        if(n==0){
            return;
        }
        int c = a + b;
        System.out.print(" "+c+" ");

        fibonacci(b,c,n-1);
    }

    public static int xPowern(int x, int n){
        if (x==0){
            return 0;
        }
        if (n==0){
           return 1;
        }

//        // Stack height is greater than n
//        // if n = 2, stack height will be 3
//        int result = x * xPowern(x,n/2) *xPowern(x,n/2) ;
//        return result;

        // To make stack height equal, solving with logn

        // if n is even
        if (n%2==0){
            return xPowern(x,n/2) * xPowern(x,n/2);
        }else {
            return xPowern(x,n/2) * xPowern(x,n/2) * x;
        }
    }

    public static void main(String[] args) {


//      printSum(1,10,0);

//        int factorial = fact(0);
//        System.out.println(factorial);

//        int a = 0, b = 1;
//        System.out.print(0);
//        System.out.print(" "+1+" ");
//        int n = 20;
//        fibonacci(a,b,n-2);

        int result = xPowern(2,5);
        System.out.println(result);

    }


}
