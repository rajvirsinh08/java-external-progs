import java.util.*;

public class ArrayListProgram
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>();

        int choice;
        String name;

        while(true)
        {
            System.out.println("\n===== ARRAYLIST MENU =====");
            System.out.println("1. Add Element");
            System.out.println("2. Display Elements");
            System.out.println("3. Traversal using Iterator");
            System.out.println("4. Remove Element");
            System.out.println("5. Display Forward");
            System.out.println("6. Display Backward");
            System.out.println("7. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            sc.nextLine();

            switch(choice)
            {
                // Add
                case 1:

                    System.out.print("Enter Name : ");
                    name = sc.nextLine();

                    list.add(name);

                    System.out.println("Element Added...");
                    break;

                // Display
                case 2:

                    System.out.println("\nElements are:");

                    for(String s : list)
                    {
                        System.out.println(s);
                    }

                    break;

                // Iterator Traversal
                case 3:

                    System.out.println("\nTraversal using Iterator:");

                    Iterator<String> itr = list.iterator();

                    while(itr.hasNext())
                    {
                        System.out.println(itr.next());
                    }

                    break;

                // Remove
                case 4:

                    System.out.print("Enter Name to Remove : ");
                    name = sc.nextLine();

                    list.remove(name);

                    System.out.println("Element Removed...");
                    break;

                // Forward Display
                case 5:

                    System.out.println("\nForward Display:");

                    ListIterator<String> l1 = list.listIterator();

                    while(l1.hasNext())
                    {
                        System.out.println(l1.next());
                    }

                    break;

                // Backward Display
                case 6:

                    System.out.println("\nBackward Display:");

                    ListIterator<String> l2 =
                    list.listIterator(list.size());

                    while(l2.hasPrevious())
                    {
                        System.out.println(l2.previous());
                    }

                    break;

                // Exit
                case 7:

                    System.out.println("Program Ended...");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}