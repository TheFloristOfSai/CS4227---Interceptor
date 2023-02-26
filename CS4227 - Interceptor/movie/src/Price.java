package src;

public abstract class Price {
    abstract int getPrice();

    abstract double getOverdueCharge(int daysRented);

    int getFRP(int daysRented) {
        return 1;
    }
}
