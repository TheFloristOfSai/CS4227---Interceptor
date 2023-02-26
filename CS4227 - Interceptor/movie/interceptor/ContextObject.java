package interceptor;

import src.Customer;
import src.Rental;

public class ContextObject {
    private Customer customer;
    private Rental rent;

    public ContextObject(Customer customer, Rental rental) {
        this.customer = customer;
        this.rent = rental;
    }
    
    public String getName() {
        return customer.getName();
    }

    public String getMovie() {
        return rent.getMovie().getTitle();
    }

    public double getPrice() {
        return rent.getPrice();
    }

    public double FRP() {
        return rent.getFRP();
    }
}