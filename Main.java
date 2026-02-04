import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        while (true) {
            System.out.println("\n1.Add Expense");
            System.out.println("2.View All Expenses");
            System.out.println("3.View Total Expense");
            System.out.println("4.View Category-wise Expense");
            System.out.println("5.Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Category: ");
                    String category = sc.nextLine();

                    System.out.print("Amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Note: ");
                    String note = sc.nextLine();

                    LocalDate date = LocalDate.now();
                    manager.addExpense(category, amount, date, note);
                    break;

                case 2:
                    manager.viewAllExpenses();
                    break;

                case 3:
                    manager.viewTotalExpense();
                    break;

                case 4:
                    System.out.print("Enter category: ");
                    String cat = sc.nextLine();
                    manager.viewCategoryWise(cat);
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}
