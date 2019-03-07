import java.util.ArrayList;
import java.util.Scanner;

class Main 
{

    public static Calculations calculate = new Calculations();
    public static ArrayList<String> applications = new ArrayList<String>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        startupEntries();


    }


    public static String pythagoreanInterface()
    {
        System.out.println("Enter a: ");
        int aValue = scanner.nextInt();
        System.out.println("Enter b: ");
        int bValue = scanner.nextInt();
        System.out.println("Enter c: ");
        int cValue = scanner.nextInt();
        return((calculate.calcPythag(aValue, bValue, cValue)));
    }


    public static double quadraticInterface()
    {
        return(0.0);
    }

    /*
    0:
    1:
    2:
    */
    public static void runApp(int input)
    {
        if(input == 0)
        {
            System.out.println("Running quadratic formula.");
            quadraticInterface();
        }
        else if(input == 1)
        {
            System.out.println("Running pythagorean theorem.");
            pythagoreanInterface();
        }
        else if(input == 2)
        {
            System.out.println("Starting flashcards.");
        }
    }
    
    public static void startupEntries()
    {
        System.out.println("Choose which app you'd like to use.");
        for(int i = 0; i < applications.size(); i++)
        {
            System.out.println(String.format("%s. %s", i, applications.get(i)));
        }
        String userInput = scanner.nextLine();

        for(int i = 0; i < applications.size(); i++)
        {
            //if statement to check if input equals 
            if(userInput.equals(applications.get(i).toLowerCase()));
            {
                //check what was selected and then use that app.
                runApp(i);
            }
        }

        System.out.println("");
    }

}