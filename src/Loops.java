public class Loops {
    void whileLoops() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    void doWhileLoops() {
        int i = 10;
        do {
            System.out.println("Do-while loop: " + i);
            i++;
        } while (i < 20);
    }

    // for loop
    void forLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println("For loop: " + i);
            for (int j = 0; j < 10; j++) {
                System.out.println("  Inner loop: " + j);
            }
        }
    }
}
