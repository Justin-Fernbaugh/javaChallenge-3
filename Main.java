import java.util.ArrayList;
import java.util.Scanner;

class Main 
{

    public Calculations calculate = new Calculations();
    public ArrayList<String> applications = new ArrayList<String>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


    }
    
    public void startupEntries()
    {
        System.out.println("Choose which app you'd like to use.");
        for(int i = 0; i < applications.size(); i++)
        {
            System.out.println(String.format("%s. %s", i, applications.get(i)));
        }

        for(int i = 0; i < applications.size(); i++)
        {
            //if statement to check if input equals 
        }

        System.out.println("");
    }

}