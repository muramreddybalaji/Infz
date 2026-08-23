public class Reverse {
    public static void main(String[] args) {

        int no = 12345;

        System.out.print(no % 10); // 5
        no = no / 10;

        System.out.print(no % 10); // 4
        no = no / 10;

        System.out.print(no % 10); // 3
        no = no / 10;

        System.out.print(no % 10); // 2
        no = no / 10;

        System.out.print(no % 10); // 1
    }
}