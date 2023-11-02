public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <1; i++) {
            for (int j = 0; j <6; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (j>=3 && j<=5) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");

                }
            }
            System.out.println(" ");
        }

        for (int i = 0; i <5; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print("*");
                if (i == 0) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}