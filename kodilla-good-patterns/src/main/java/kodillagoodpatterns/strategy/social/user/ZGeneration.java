package kodillagoodpatterns.strategy.social.user;

import kodillagoodpatterns.strategy.social.user.publishery.SnapchatPublisher;
import kodillagoodpatterns.strategy.social.user.publishery.SocialPublisher;

public class ZGeneration extends User{

    public ZGeneration(String nickname) {
        super(nickname);
        this.socialPublisher = new SnapchatPublisher();
    }
}
