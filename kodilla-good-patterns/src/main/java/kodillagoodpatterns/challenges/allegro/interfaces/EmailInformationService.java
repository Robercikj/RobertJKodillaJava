package kodillagoodpatterns.challenges.allegro.interfaces;

import kodillagoodpatterns.challenges.allegro.model.User;

public class EmailInformationService implements InformationService {

    @Override
    public void inform(User user){
        System.out.println("Email sending to: " + user.getEmail());
    }

}
