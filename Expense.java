import java.time.LocalDate;

public class Expense {

    private String category;
    private double amount;
    private LocalDate date;
    private String note;

    public Expense(String category, double amount, LocalDate date, String note) {
        this.category = category;
        this.amount = amount;
        this.date = date;
        this.note = note;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getNote() {
        return note;
    }
}
