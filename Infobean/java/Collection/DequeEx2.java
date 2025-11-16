import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequeEx2 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        Deque<String> dq = new ArrayDeque<>();
        for (String word : sentence.split(" "))
        {
         dq.push(word);
        }

        System.out.print("Reversed Sentence: ");
        while (!dq.isEmpty()) System.out.print(dq.pop() + " ");
    }
}
