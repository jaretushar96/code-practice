import java.util.Scanner;

// Custom exception for wrong answers
class WrongAnswerException extends Exception 
{
    String correctAnswer;
    WrongAnswerException(String correctAnswer) 
    {
        this.correctAnswer = correctAnswer;
    }
    public String getCorrectAnswer() {
        return correctAnswer;
    }
}

// Custom exception for level failure
class LevelFailedException extends Exception {
    LevelFailedException(String msg) {
        super(msg);
    }
}

// Class to hold question details
class Question {
    String question;
    String[] options;
    int correctOption;  // 1-based index

    Question(String question, String[] options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }

    void display() {
        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ") " + options[i]);
        }
    }

    boolean checkAnswer(int ans) {
        return ans == correctOption;
    }

    String getCorrectAnswer() {
        return options[correctOption - 1];
    }
}

// Main Game class
public class KBC{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Welcome to KBC Game (No Collections Used) ===");
        System.out.println("Enter option number (1-4) for each question.\n");

        try {
            playLevel(1, createLevel1(), 1);
            playLevel(2, createLevel2(), 2);
            playLevel(3, createLevel3(), 3);
            playLevel(4, createLevel4(), 4);
            System.out.println("\n🎉 CONGRATULATIONS! You completed all levels successfully!");
        } catch (LevelFailedException e) {
            System.out.println("\n" + e.getMessage());
            System.out.println("💀 Game Over. Better luck next time!");
        }
    }

    // Play a level
    static void playLevel(int level, Question[] questions, int requiredCorrect) throws LevelFailedException {
        System.out.println("\n--- LEVEL " + level + " ---");
        System.out.println("You must answer at least " + requiredCorrect + " question(s) correctly to pass.\n");

        int correctCount = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ":");
            questions[i].display();

            System.out.print("Your Answer: ");
            int ans = readInt();

            try {
                if (questions[i].checkAnswer(ans)) {
                    System.out.println("✅ Correct!\n");
                    correctCount++;
                } else {
                    throw new WrongAnswerException(questions[i].getCorrectAnswer());
                }
            } catch (WrongAnswerException e) {
                System.out.println("❌ Your answer is wrong.");
                System.out.println("✅ Correct answer: " + e.getCorrectAnswer() + "\n");
            }
        }

        System.out.println("You answered " + correctCount + " correct out of " + questions.length + ".");
        if (correctCount < requiredCorrect) {
            throw new LevelFailedException("You failed Level " + level + ". Needed " + requiredCorrect + " correct answers.");
        } else {
            System.out.println("🎯 You passed Level " + level + "! Proceeding to next level...");
        }
    }

    // Read integer safely
    static int readInt() {
        int ans = -1;
        try {
            ans = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            ans = -1; // invalid input treated as wrong
        }
        return ans;
    }

    // ---------- Question sets for levels (no Collections used) ----------

    static Question[] createLevel1() {
        Question[] q = new Question[3];
        q[0] = new Question("Which planet is known as the Red Planet?",
                new String[]{"Earth", "Mars", "Jupiter", "Venus"}, 2);
        q[1] = new Question("What is the capital of India?",
                new String[]{"Mumbai", "Delhi", "Kolkata", "Chennai"}, 2);
        q[2] = new Question("Which is the largest ocean on Earth?",
                new String[]{"Indian", "Arctic", "Atlantic", "Pacific"}, 4);
        return q;
    }

    static Question[] createLevel2() {
        Question[] q = new Question[4];
        q[0] = new Question("Which gas do plants absorb from the atmosphere?",
                new String[]{"Oxygen", "Carbon Dioxide", "Hydrogen", "Nitrogen"}, 2);
        q[1] = new Question("Who invented the telephone?",
                new String[]{"Newton", "Einstein", "Alexander Graham Bell", "Edison"}, 3);
        q[2] = new Question("How many sides does a triangle have?",
                new String[]{"2", "3", "4", "5"}, 2);
        q[3] = new Question("Which is the smallest prime number?",
                new String[]{"1", "2", "3", "5"}, 2);
        return q;
    }

    static Question[] createLevel3() {
        Question[] q = new Question[5];
        q[0] = new Question("Who wrote 'Ramayana'?",
                new String[]{"Tulsidas", "Valmiki", "Kalidas", "Ved Vyasa"}, 2);
        q[1] = new Question("Which number is the square root of 49?",
                new String[]{"6", "7", "8", "9"}, 2);
        q[2] = new Question("What is the freezing point of water?",
                new String[]{"0°C", "100°C", "50°C", "25°C"}, 1);
        q[3] = new Question("Which continent is known as the 'Dark Continent'?",
                new String[]{"Asia", "Europe", "Africa", "Australia"}, 3);
        q[4] = new Question("Which part of the plant conducts photosynthesis?",
                new String[]{"Root", "Stem", "Leaf", "Flower"}, 3);
        return q;
    }

    static Question[] createLevel4() {
        Question[] q = new Question[6];
        q[0] = new Question("Who discovered gravity?",
                new String[]{"Newton", "Galileo", "Einstein", "Tesla"}, 1);
        q[1] = new Question("Which planet has rings?",
                new String[]{"Earth", "Mars", "Jupiter", "Saturn"}, 4);
        q[2] = new Question("Which metal is liquid at room temperature?",
                new String[]{"Iron", "Mercury", "Copper", "Lead"}, 2);
        q[3] = new Question("Which organ pumps blood?",
                new String[]{"Heart", "Liver", "Brain", "Kidney"}, 1);
        q[4] = new Question("Which country invented paper?",
                new String[]{"India", "Egypt", "China", "Japan"}, 3);
        q[5] = new Question("Which gas is essential for breathing?",
                new String[]{"Carbon Dioxide", "Oxygen", "Nitrogen", "Hydrogen"}, 2);
        return q;
    }
}

