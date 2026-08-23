import java.util.Scanner;

class OneD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        int no = 1;

        for (int i = 0; i < size; i++) {
            arr[i] = no++;
            System.out.print(arr[i] + " ");
        }
    }
}