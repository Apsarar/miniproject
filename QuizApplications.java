import java.util.Scanner;

public class QuizApplications {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Quiz questions

        String[] questions = {
                "Which of the following is not a primitive data type in Java?",
                "What is the purpose of a constructor in Java?",
                "Which of the following is a loop structure in Java?",
                "Which keyword is used to create a subclass in Java??",
                "What is the main method in Java used for??"
        };

        // Quiz options
        String[][] options = {
                {"A. int", "B. boolean", "C. float", "D. string"},
                {"A. To create an object", "B. To initialize an object's data members", "C. To define a method", "D.To inherit from a parent class"},
                {"A. if", "B. while", "C. switch", "D. try-catch"},
                {"A. super", "B. class", "C. extends", "D. this"},
                {"A. Creating objects", "B. Initializing data members", "C. Running the program", "D. Inheriting from a parent class"}
        };

        // Quiz answers
        int[] answers = {4, 2, 2, 3, 3}; 
// The correct option is at index 1-based index

        // Quiz score
        int score = 0;

        // Ask each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }
            System.out.print("Your answer (enter option letter): ");
            String userAnswer = scanner.nextLine().trim().toLowerCase();
            int userOption = userAnswer.charAt(0) - 'a' + 1; // Convert letter to 1-based index
            if (userOption == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect.\nThe correct answer is: " + options[i][answers[i]-1] + "\n");
            }
        }

        // Print final score
        System.out.println("Quiz complete. Your score is: " + score + "/" + questions.length);
    }
}
