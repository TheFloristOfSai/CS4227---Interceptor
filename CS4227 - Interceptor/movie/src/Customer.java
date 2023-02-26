package src;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String statement() {
        String history = "Rental histoty of " + getName() + "\n";
        for (Rental rental : rentals)
            history += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getPrice()) + "\n";
        history += "You owe " + String.valueOf(getTotal()) + "\n";
        history += String.valueOf(getTotalFRP()) + " frequent renter points earned!";
        return history;
    }

    public String htmlStatement() {
        String result = "<h1>Rental history of <b>" + getName() + "</b></h1>\n";
        for (Rental rental : rentals)
            result += "<p>" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getPrice()) + "</p>\n";
        result += "<p>You owe <b>" + String.valueOf(getTotal()) + "</b></p>\n";
        result += String.valueOf(getTotalFRP()) + " frequent renter points earned!</b></p>";
        return result;
    }

    private double getTotal() {
        double total = 0;
        for (Rental rental : rentals)
            total += rental.getPrice();
        return total;
    }

    private int getTotalFRP() {
        int total = 0;
        for (Rental rental : rentals)
            total += rental.getFRP();
        return total;
    }

}
