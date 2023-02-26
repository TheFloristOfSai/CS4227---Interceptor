package src;

public class Rental {
    Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public double getPrice() {
        return movie.getCharge(daysRented);
    }

    public int getFRP() {
        return movie.getFRP(daysRented);
    }
}
