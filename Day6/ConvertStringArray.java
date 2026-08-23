import java.util.Scanner;

class ConvertStringArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.next();

        char c[] = name.toCharArray();

        for (int i = 0; i < name.length(); i++) {
            System.out.print(c[i] + " * ");
        }
    }
}