public class ControlStructure {
    public static void main(String[] args) {

        // if, else-if, else
        int age = 15;
        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are an adult.");
        }

        // switch statement
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            default:
                System.out.println("Keep trying!");
                break;
        }

        // for-loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // while-loop
        int count = 1;
        while (count <= 5) {
            System.out.println("Count is: " + count);
            count++;
        }

        // do-while loop
        count = 5;
        do {
            System.out.println("This will print at least once.");
            count--;
        } while (count > 0);

    }
}
