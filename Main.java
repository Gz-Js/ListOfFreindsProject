import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> bsfNames = new ArrayList<String>();
        String answer = "";
        int count = 0;

        System.out.println("Welcome! Please enter your friends' first name. Press \"d\" when you are done.");
        answer = scan.nextLine();
        while (!(answer.equals("d")))
        {
            count++;
            names.add(answer);
            answer = scan.nextLine();
        }
        System.out.println("You have entered " + count + " friends.\nHere is your list of friends:");
        for (int i = 0; i < names.size(); i++)
        {
            System.out.println((i + 1) + ". " + names.get(i));
        }
        System.out.println("Now I will select 2 friends at random for you to take to the movies...");
        int rand1 = (int)(Math.random() * count);
        int rand2 = (int)(Math.random() * count);
        while (rand1 == rand2)
        {
            rand2 = (int)(Math.random() * count);
        }

        System.out.println("You should take " + names.get(rand1) + " and " + names.get(rand2));
        int bsfnumber = 0;
        int bsfCount = 0;
        System.out.println("\nWhich friends would you like to remove from your friends list, and add to your best friends list? Enter 0 to end.");
        bsfnumber = scan.nextInt();
        while (bsfnumber != 0)
        {
            String temp = names.remove(bsfnumber - 1);
            bsfNames.add(temp);
            count--;
            bsfCount++;
            bsfnumber = scan.nextInt();
        }
        System.out.println("Here's your friends list: ");
        for (int i = 0; i < names.size(); i++)
        {
            System.out.println((i + 1) + ". " + names.get(i));
        }
        System.out.println("Here's your best friends list: ");
        for (int i = 0; i < bsfNames.size(); i++)
        {
            System.out.println((i + 1) + ". " + bsfNames.get(i));
        }
    }
}