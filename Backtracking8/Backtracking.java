package JavaWithDSA.Backtracking8;

public class Backtracking {
    public static void main(String[] args) {
       int s = f(4);
        System.out.println(s);

    }

    public static int f(int n){
        if (n <= 1) /* base case */
            return n;
        else /* recursive caseS */
            return f(n-1) + f(n-2);
    }
}
