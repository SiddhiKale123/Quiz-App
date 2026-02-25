import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {

        List<Question> questions = new ArrayList<>();

        // Adding questions
        questions.add(new Question(
                "1. Who is known as the Father of Java?",
                new String[]{"1. Dennis Ritchie", "2. James Gosling", "3. Bjarne Stroustrup", "4. Guido van Rossum"},
                2));

        questions.add(new Question(
                "2. Which keyword is used to inherit a class in Java?",
                new String[]{"1. implement", "2. extends", "3. inherits", "4. super"},
                2));

        questions.add(new Question(
                "3. Which method is the entry point of a Java program?",
                new String[]{"1. start()", "2. main()", "3. run()", "4. execute()"},
                2));

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("===== Welcome to Java Quiz =====");

        for (Question q : questions) {

            System.out.println("\n" + q.getQuestionText());

            for (String option : q.getOptions()) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (1-4): ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == q.getCorrectAnswer()) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer is option " + q.getCorrectAnswer());
            }
        }

        System.out.println("\n===== Quiz Finished =====");
        System.out.println("Your Score: " + score + "/" + questions.size());

        // Result message
        if (score == questions.size()) {
            System.out.println("Excellent Performance!");
        } else if (score >= 2) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Practicing!");
        }

        scanner.close();
    }
}
