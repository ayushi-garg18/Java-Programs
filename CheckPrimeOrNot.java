public class CheckPrimeOrNot {
    public static boolean isPrime(int num) {
        for(int i = 2 ; i < Math.sqrt(num) ; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 6;
        if(num >= 2 && isPrime(num)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
