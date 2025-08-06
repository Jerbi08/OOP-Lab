import java.util.Scanner;
public class ex2_8 {
	
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter 10 numbers:");
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++) {
            System.out.printf("Enter a value %d: ",i+1);
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array: ");
        for(int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nOdd Array : ");
        for (int num : arr) {
            if (num % 2 != 0)
                System.out.print((num * num) + " ");
        }
        System.out.print("\nEven Array : ");
        for (int num : arr) {
            if (num % 2 == 0)
                System.out.print((num * num * num) + " ");
        }
    }
}
