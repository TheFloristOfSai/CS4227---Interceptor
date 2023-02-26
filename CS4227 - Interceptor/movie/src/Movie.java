package src;

public class Movie {
    public static final int REGULAR = 0;
    public static final int NEW = 1;
    public static final int CHILD = 2;

    private String title;
    Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public String getTitle() {
        return title;
    }

    private void setPriceCode(int priceCode) {
        switch (priceCode) {
            case NEW:
                price = new NewPrice();
                break;
            case REGULAR:
                price = new RegularPrice();
                break;
            case CHILD:
                price = new ChildPrice();
                break;
            default:
                throw new IllegalArgumentException("price code doesn't exist");
        }
    }

    public double getCharge(int daysRented) {
        return price.getOverdueCharge(daysRented);
    }

    public int getFRP(int daysRented) {
        return price.getFRP(daysRented);
    }
}
