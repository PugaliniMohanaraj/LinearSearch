import java.util.Scanner;

public class LinearSearch{
	public static boolean Search(int[] array, int key){
		  for (int element : array) {
            if (element == key) {
                return true;
            }
        }
		return false;
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the numbers of arrays: ");
        int N = input.nextInt();
		
		int[] array = new int[N];
		
		System.out.println("Enter " + N + " numbers:");
		
		 for (int i = 0; i < N; i++) {
            array[i] = input.nextInt();
        }

		System.out.print("Enter the target integer (x): ");
        int x = input.nextInt();
		
		boolean result = Search(array, x);
		
		 if (result) {
            System.out.println("True: The " + x + " is found");
        } else {
            System.out.println("False: The " + x + " is not found");
        }

        input.close();
		
	}
}