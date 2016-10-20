
public class Main {

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 6, 7, 9, 11};
		
		System.out.print("Printing String: ");
		print("Hello Java");
		
		System.out.print("Printing Number: ");
		print(2015);
		
		System.out.println("Printing Array:");
		print(arr);
		
		print(10, 2.22, 10.5);
	}
	
	public static void print(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Item arr[" + i + "]: " + arr[i]);
			System.out.println();
		}
	}
	
	public static void print(int number){
		System.out.println(number + 1000);
	}
	
	public static void print(String word){
		System.out.println(word);
	}
	
	public static void print(double d1, double d2, int num){
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(num);
	}
	
	public static void print(int num, double d1, double d2){
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(num);
	}
}
