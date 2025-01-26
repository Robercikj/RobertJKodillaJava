package kodillagoodpatterns.strategy.social.user;

import kodillagoodpatterns.strategy.social.user.publishery.FacebookPublisher;

import java.util.concurrent.Flow;

public class Millenials extends User {

    public Millenials(String nickname) {
        super(nickname);
        this.socialPublisher = new FacebookPublisher();
    }
}
