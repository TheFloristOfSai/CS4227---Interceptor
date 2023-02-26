package test;

import org.junit.Test;

import interceptor.ConInterceptor;
import interceptor.ContextObject;
import interceptor.Dispatcher;
import src.Customer;
import src.Movie;
import src.Rental;

public class TestCase {
    @Test
    public void test() {
        ConInterceptor ConcreteInterceptor = new ConInterceptor();
        Dispatcher dis = new Dispatcher();
        dis.attach(ConcreteInterceptor);
        Customer customer = new Customer("Jordan");
        Rental example = new Rental(new Movie("V for Vendatta", Movie.REGULAR), 3);
        customer.addRental(example);
        ContextObject ConObject = new ContextObject(customer, example);
        dis.Rent(ConObject);
        String expected = "Jordan has rented V for Vendetta for the price of $1.5";

        System.out.println(expected);
        System.out.println(customer.statement());
        System.out.println(dis.equals(customer.statement()));
    }

}
