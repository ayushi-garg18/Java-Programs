public class Anagram {
	public static void isAnagram(String str1,String str2) {
		char []arr1 = str1.toCharArray();
		char []arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		String sortedstr1 = new String(arr1);
		String sortedstr2 = new String(arr2);
		
		if(sortedstr1.equals(sortedstr2)) {
			System.out.print("Anagram");
		}
		else {
			System.out.print("Not an Anagram");
		}
	}
	public static void main(String args[]) {
		String str1 = "cat";
		String str2 = "act";
		isAnagram(str1,str2);
	}	
}
