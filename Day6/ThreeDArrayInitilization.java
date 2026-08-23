import java.util.Scanner;

class ThreeDarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        int a[][][] = new int[size][size][size];
        int b[][][] = new int[size][size][size];
        int c[][][] = new int[size][size][size];

        int no = 10;

        for (int m = 0; m < size; m++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {

                    a[m][i][j] = no;
                    b[m][i][j] = a[m][i][j] + a[m][i][j];
                    c[m][i][j] = a[m][i][j] + b[m][i][j];

                    no = no + 10;

                    System.out.print(c[m][i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}