package interceptor;

public class ConInterceptor implements Interceptor {
    public void interceptRentFilms(ContextObject ConObj) {
        String message = ConObj.getName() + " has rented " + ConObj.getMovie() + " for " + ConObj.getPrice();
        System.out.println(message);
    }
    public void interceptFRP(ContextObject ConObj) {
        String message = ConObj.getName() + "has" + ConObj.FRP();
        System.out.println(message);
    }
}
