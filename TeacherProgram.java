import java.util.Scanner;

class Teacher
{
    String teacherName[];
    String subject[];
    double salary[];

    int n;

    // Constructor
    Teacher(int n)
    {
        this.n = n;

        teacherName = new String[n];
        subject = new String[n];
        salary = new double[n];
    }

    // Accept Data Method
    void acceptData()
    {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < n; i++)
        {
            System.out.println("\nEnter Teacher " + (i + 1) + " Details");

            System.out.print("Enter Teacher Name : ");
            teacherName[i] = sc.nextLine();

            System.out.print("Enter Subject : ");
            subject[i] = sc.nextLine();

            System.out.print("Enter Salary : ");
            salary[i] = sc.nextDouble();

            sc.nextLine();
        }
    }

    // Display Method
    void displayData()
    {
        double total = 0;
        double max = salary[0];
        String highestTeacher = teacherName[0];

        System.out.println("\n===== TEACHER DETAILS =====");

        for(int i = 0; i < n; i++)
        {
            System.out.println("\nTeacher Name : " + teacherName[i]);
            System.out.println("Subject      : " + subject[i]);
            System.out.println("Salary       : " + salary[i]);

            total = total + salary[i];

            // Highest Salary
            if(salary[i] > max)
            {
                max = salary[i];
                highestTeacher = teacherName[i];
            }
        }

        double avg = total / n;

        System.out.println("\nTotal Salary   : " + total);
        System.out.println("Average Salary : " + avg);

        System.out.println("\nHighest Paid Teacher : "
                           + highestTeacher);

        System.out.println("Highest Salary       : " + max);
    }
}

public class TeacherProgram
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter Number of Teachers : ");
        n = sc.nextInt();

        Teacher t = new Teacher(n);

        t.acceptData();

        t.displayData();
    }
}