import java.util.Scanner;


public class Voting_System
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int votesOm = 0;
        int votesViraj = 0;
        int votesRohit = 0;

        char choice = 'Y';

        while (choice == 'Y' || choice == 'y') {
            System.out.println("\n---- Voting Menu ----\n1. Om Phopse (BJP)\n2. Viraj Bered (NCP)\n3. Rohit Mhaske (MNS)\nEnter your choice (1-3):  ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    votesOm++;
                    break;
                case 2:
                    votesViraj++;
                    break;
                case 3:
                    votesRohit++;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("Do you want to continue voting? (Y/N) : ");
            choice = sc.next().charAt(0);
        }

        int totalVotes = votesOm + votesViraj + votesRohit;

        double percentOm = 0, percentViraj = 0, percentRohit = 0;

        if (totalVotes > 0) {
            percentOm = (votesOm * 100.0) / totalVotes;
            percentViraj = (votesViraj * 100.0) / totalVotes;
            percentRohit = (votesRohit * 100.0) / totalVotes;
        }

        System.out.println("\n---- Voting Results ----\nOm Phopse (BJP) - Votes: " + votesOm + " (" + percentOm + "%)\nViraj Bered (NCP) - Votes: " + votesViraj + " (" + percentViraj + "%)\nRohit Mhaske (MNS) - Votes: " + votesRohit + " (" + percentRohit + "%)");

        String winner = "";
        double winPercent = 0;
        String second = "";
        double secondPercent = 0;

        if (votesOm > votesViraj && votesOm > votesRohit) {
            winner = "Om Phopse (BJP)";
            winPercent = percentOm;
            if (votesViraj > votesRohit) {
                second = "Viraj Bered (NCP)";
                secondPercent = percentViraj;
            } else {
                second = "Rohit Mhaske (MNS)";
                secondPercent = percentRohit;
            }
        } else if (votesViraj > votesOm && votesViraj > votesRohit) {
            winner = "Viraj Bered (NCP)";
            winPercent = percentViraj;
            if (votesOm > votesRohit) {
                second = "Om Phopse (BJP)";
                secondPercent = percentOm;
            } else {
                second = "Rohit Mhaske (MNS)";
                secondPercent = percentRohit;
            }
        } else if (votesRohit > votesOm && votesRohit > votesViraj) {
            winner = "Rohit Mhaske (MNS)";
            winPercent = percentRohit;
            if (votesOm > votesViraj) {
                second = "Om Phopse (BJP)";
                secondPercent = percentOm;
            } else {
                second = "Viraj Bered (NCP)";
                secondPercent = percentViraj;
            }
        } else {
            System.out.println("\nIt's a tie! No clear winner.");
       
            return;
        }

        System.out.println("\nWinner: " + winner + "\nWinner got " + winPercent + "% votes");

        if (secondPercent > 0) {
            double margin = winPercent - secondPercent;
            System.out.println("Won by " + margin + "% more than " + second);
        }
    }
}
