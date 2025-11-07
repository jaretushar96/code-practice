import java.util.Scanner;

class Game1
{
    
     String qustion,option1,option2,option3,option4;
     int correctAnswer;
    public Game1(String qustion ,String option1, String option2, String option3,String option4,int correctAnswer) 
    {
        this.qustion=qustion;
        this.option1=option1;
        this.option2=option2;
        this.option3=option3;
        this.option4=option4;
        this.correctAnswer=correctAnswer;
      

    }
   
    int qusAnswer()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(qustion+"\n 1"+option1+" \n 2"+option2+"\n 3"+option3+"\n 4"+option4);
       
        try
        {
             System.out.println("Enter Your Answer ");
        int userAnswer=sc.nextInt();
              
          if (userAnswer == correctAnswer)
           {
            System.out.println("Correct Answer!");
            return 1;
        }
         else {
            System.out.println(" Wrong Answer!");
            System.out.println("Correct answer was option " + correctAnswer + ".");
            return 0; 
        }
           

           
        }
       catch (Exception e)
        {
             System.out.println("You entered wrong choice   "+e.getMessage());
             return 0;
        }
         
       
}
     

}
public class KBCGame {
    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

      Game1[] level1 = new Game1[3];
            level1[0] = new Game1("Which is the capital of India?", "Delhi", "Mumbai", "Pune", "Bhopal", 1);
            level1[1] = new Game1("Which planet is known as the Red Planet?", "Earth", "Mars", "Jupiter", "Venus", 2);
            level1[2] = new Game1("Which is the largest ocean?", "Atlantic", "Pacific", "Indian", "Arctic", 2);
            level1[3] = new Game1("Which festival is known as Festival of Lights?", "Holi", "Diwali", "Eid", "Christmas", 2);
        

      Game1[] level2 = new Game1[4];
            level2[0] = new Game1("Who wrote Ramayana?", "Valmiki", "Tulsidas", "Kalidas", "Ved Vyas", 1);
            level2[1] = new Game1("National animal of India?", "Lion", "Tiger", "Elephant", "Leopard", 2);
            level2[2] = new Game1("Which gas is used in photosynthesis?", "Oxygen", "Nitrogen", "Carbon dioxide", "Hydrogen", 3);
            level2[3] = new Game1("Which is the smallest planet?", "Mercury", "Mars", "Venus", "Earth", 1);


       Game1[] level3 = new Game1[5];
        level3[0] = new Game1("Who is known as the Father of Computer?", "Newton", "Charles Babbage", "Edison", "Einstein", 2);
        level3[1] = new Game1("What is H2O commonly known as?", "Oxygen", "Hydrogen", "Water", "Helium", 3);
        level3[2] = new Game1("Which device is used to measure temperature?", "Barometer", "Thermometer", "Altimeter", "Hygrometer", 2);
        level3[3] = new Game1("Who invented the telephone?", "Edison", "Bell", "Newton", "Galileo", 2);
       
       
        Game1[] level4 = new Game1[6];
        level4[0] = new Game1("Who discovered gravity?", "Newton", "Einstein", "Tesla", "Darwin", 1);
        level4[1] = new Game1("Which is the largest continent?", "Africa", "Asia", "Europe", "Australia", 2);
        level4[2] = new Game1("Which organ purifies blood?", "Heart", "Lungs", "Kidney", "Liver", 3);
        level4[3] = new Game1("Which gas do we breathe in?", "Nitrogen", "Oxygen", "Hydrogen", "Carbon dioxide", 2);
        
        
        if (playLevel(level1, 1, 1)) {
            if (playLevel(level2, 2, 2)) {
                if (playLevel(level3, 3, 3)) {
                    if (playLevel(level4, 4, 4)) {
                        System.out.println("\n🏆 CONGRATULATIONS! You cleared all levels successfully!");
                    }
                }
            }
        }
        System.out.println("\n🎮 Game Over — Thank you for playing!");
    }    
      

public static boolean playLevel(Game1[] level, int levelNumber, int requiredCorrect) {
        System.out.println("\n=========================");
        System.out.println(" LEVEL " + levelNumber + " START ");
        System.out.println("=========================");

        int correctCount = 0;
        try{
        for (Game1 q : level) {
            correctCount += q.qusAnswer();
        }

        System.out.println("\nYou got " + correctCount + " correct answers out of " + level.length + ".");
        if (correctCount >= requiredCorrect) {
            System.out.println(" You cleared Level " + levelNumber + "!");
            return true;
         }
        

        else{
            System.out.println(" You failed Level " + levelNumber + ". Required at least " + requiredCorrect + " correct answers.");
            return false;
        }
        
        } 
        catch (Exception e) {
            System.out.println("Error details: " + e.getMessage());
             return false;
        }
    }
}
