import java.time.LocalDate;
import java.util.ArrayList;

public class ExpenseManager {

    private ArrayList<Expense> expenses = new ArrayList<>();

    public void addExpense(String category, double amount, LocalDate date, String note) {
        expenses.add(new Expense(category, amount, date, note));
        System.out.println("Expense added successfully");
    }

    public void viewAllExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded");
            return;
        }

        for (Expense e : expenses) {
            System.out.println(
                e.getDate() + " | " +
                e.getCategory() + " | " +
                e.getAmount() + " | " +
                e.getNote()
            );
        }
    }

    public void viewTotalExpense() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.getAmount();
        }
        System.out.println("Total Expense: " + total);
    }

    public void viewCategoryWise(String category) {
        double total = 0;
        boolean found = false;

        for (Expense e : expenses) {
            if (e.getCategory().equalsIgnoreCase(category)) {
                total += e.getAmount();
                found = true;
            }
        }

        if (found) {
            System.out.println("Total expense for " + category + ": " + total);
        } else {
            System.out.println("No expenses found for category: " + category);
        }
    }
}
