public class Print1to100WithoutUsingLoop {
    public static void printNumber(int num) {
        if(num <= 100){
            System.out.println(num + "  ");
            printNumber(num+1);
        }
    }
    public static void main(String[] args) {
        printNumber(1);
    }
}
