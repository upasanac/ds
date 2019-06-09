package dp;

public class Fibonacci {

    int findFib(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int array[] = new int[n+1];
        array[0] = 0;
        array[1] = 1;

        for (int i=2; i<=n; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        return array[n];
    }

    public static void main(String args[]) {
        int n = 9;
        System.out.println("Fib =" + new Fibonacci().findFib(n));
    }
}

