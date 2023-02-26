package src;

public class ChildPrice extends Price {
    @Override
    public int getPrice() {
        return Movie.CHILD;
    }

    @Override
    double getOverdueCharge(int rentDays) {
        double Overdue = 1.5;
        if (rentDays > 3)
            Overdue += (rentDays - 3) * 1.5;
        return Overdue;
    }
}
