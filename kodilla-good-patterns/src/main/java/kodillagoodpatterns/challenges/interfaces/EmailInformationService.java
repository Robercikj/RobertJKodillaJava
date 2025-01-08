package kodillagoodpatterns.challenges.interfaces;

import kodillagoodpatterns.challenges.model.Product;
import kodillagoodpatterns.challenges.model.User;

public class EmailInformationService implements InformationService {

    @Override
    public void inform(User user, Product product){
        System.out.println("Email sending to: " + getEmail());
    }

}
