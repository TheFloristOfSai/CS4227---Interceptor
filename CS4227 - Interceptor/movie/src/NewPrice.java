package src;

public class NewPrice extends Price {
    @Override
    public int getPrice() {
        return Movie.NEW;
    }

    @Override
    public double getOverdueCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    int getFRP(int daysRented) {
        if (daysRented > 1)
            return 2;
        return 1;
    }
}
