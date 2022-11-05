import java.util.Scanner;

//This is the first
//Author: Mustafa Tuna
//Date:
public class Welcome {
    // Ctrl + Space
    public static void main(String[] args) {
        int myAge = 29;
        double myHeight = 178.5;
        String mySurname = "Tuna";
        System.out.println("Hello Mustafa. You are " + myAge);

        if(myHeight > 180) {
            System.out.println("You are tall");
        } else {
            System.out.println("You are short");
        }

        //Get the user input
        // First, create a Scaner object
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your weight");

        // Get the value
        int myWeight = userInput.nextInt();
        System.out.println("Berk's weight is " + myWeight);

        double  myBMI = userInput.nextDouble();
        System.out.println("Mustafa's weight in double is " + myBMI);

        // if there is one line in for, if blocks, no need to use parenthesis
        for(int i = 0; i < 5; i++)
            System.out.println("Hello " + i+1);
    }
}
