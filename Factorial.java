public class Factorial {
	public static int fact(int num) {
		if(num==0) {
			return 1;
		}
		else {
			return num * fact(num-1);
		}
	}
	public static void main(String args[]) {
		int num = 6;
		System.out.print("Factorial of "+num+ " is "+fact(num));
	}	
}
