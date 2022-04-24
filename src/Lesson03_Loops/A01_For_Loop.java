package Lesson03_Loops;

public class A01_For_Loop {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            System.out.print(" " + i + " ");
        }
        System.out.println();

        int k = 1;
        for (; k<=10; k+=2) {
            System.out.print(" " + k + " ");
        }

        System.out.println();
        for (int column = 1; column <=5; column++) {

            for (int row = 1; row <= column; row++ ) {

                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
