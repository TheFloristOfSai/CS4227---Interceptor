package interceptor;

import java.util.ArrayList;

public class Dispatcher {
    ArrayList<ConInterceptor> intercept;

    public Dispatcher() {
        intercept = new ArrayList<ConInterceptor>();
    }

    public void attach(ConInterceptor ConcreteInterceptor) {
        intercept.add(ConcreteInterceptor);
    }

    public void detach(ConInterceptor ConcreteInterceptor) {
        intercept.remove(ConcreteInterceptor);
    }

    public void Rent(ContextObject ContextObject) {
        for (ConInterceptor i : intercept) {
            i.interceptRentFilms(ContextObject);
        }
    }

    public void FRP(ContextObject ContextObject) {
        for (ConInterceptor i : intercept) {
            i.interceptFRP(ContextObject);
        }
    }

}
