import java.util.Scanner;

class FibonacciSeries{
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        System.out.println("Enter the number of elements you want to print in the series:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The Fibonacci Series is: ");
        System.out.print(first + "  " + second + "  ");
        for(int i = 2 ; i < n ; i++){
            int next = first + second;
            System.out.print(next + "  ");
            first = second;
            second = next;
        }
    }
}