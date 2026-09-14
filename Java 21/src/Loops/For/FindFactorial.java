package Loops.For;

public class FindFactorial {
    public static void main(String[] args){
        int n = 5;
        int factorial = 1;

        for(int i = 1; i <= n; i++){
            factorial = n * i;
        }
        System.out.println(factorial);
    }

}
