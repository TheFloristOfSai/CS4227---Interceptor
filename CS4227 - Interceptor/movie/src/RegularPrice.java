package src;

public class RegularPrice extends Price {
    @Override
    public int getPrice() {
        return Movie.REGULAR;
    }

    @Override
    public double getOverdueCharge(int daysRented) {
        double overdue = 2;
        if (daysRented > 2)
            overdue += (daysRented - 2) * 1.5;
        return overdue;
    }
}
