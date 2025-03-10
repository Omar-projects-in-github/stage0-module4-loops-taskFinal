package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {

            // empty spaces
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print(" ");
            }


            // decreasing sequence
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // increasing sequence
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
