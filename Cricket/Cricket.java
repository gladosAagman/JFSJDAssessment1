import java.util.Random;
import java.util.Scanner;

class Player {
    String name;
    int age;
    int total_innings;
    String role;

    Player(String name, int age, int total_innings, String role) {
        this.name = name;
        this.age = age;
        this.total_innings = total_innings;
        this.role = role;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Total innings: " + this.total_innings);
        System.out.println("Role: " + this.role);
        
}
}
public class Cricket {

  public static void main(String args[]) {
    Player[] team = new Player[12];
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    
     for (int i = 0; i < team.length; i++) {
            System.out.println("Enter details for Player " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Role: ");
            String role = scanner.nextLine();
            System.out.print("Enter total Innings: ");
            int totalInnings = scanner.nextInt();

          team[i] = new Player(name, age, totalInnings, role);
        }
        int captainIndex = random.nextInt(team.length);
        Player captain = team[captainIndex];

        // details of the selected captain
        System.out.println("\nCaptain Details:");
      captain.displayDetails();


  }
}