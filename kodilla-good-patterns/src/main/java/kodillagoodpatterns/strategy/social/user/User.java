package kodillagoodpatterns.strategy.social.user;

import kodillagoodpatterns.strategy.predictors.customers.Customer;
import kodillagoodpatterns.strategy.predictors.customers.IndividualYoungCustomer;
import kodillagoodpatterns.strategy.social.user.publishery.FacebookPublisher;
import kodillagoodpatterns.strategy.social.user.publishery.SocialPublisher;

public class User {

    private final String nickname;
    SocialPublisher socialPublisher;


    public User(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }
    public String sharePost(){
        return socialPublisher.share();
    }
    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }


}
