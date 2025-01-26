package kodillagoodpatterns.strategy.social.user;

import kodillagoodpatterns.strategy.social.user.publishery.SnapchatPublisher;
import kodillagoodpatterns.strategy.social.user.publishery.TwitterPublisher;

public class YGeneration extends User{


    public YGeneration(String nickname) {
        super(nickname);
        this.socialPublisher = new TwitterPublisher();
    }
}
