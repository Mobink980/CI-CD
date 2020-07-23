
public class Hello {
	
	public static void main(String[] args) {
		System.out.println("Hello");
		int []arr = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Goodbye");
			arr[i] = i;
		}
		String str = "Welcome";
		for (int i = 0; i < 5; i++){
			System.out.print(arr[i] + " " + str);
		}
		
	}

}
