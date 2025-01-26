package kodillagoodpatterns.strategy;

import kodillagoodpatterns.strategy.social.user.Millenials;
import kodillagoodpatterns.strategy.social.user.User;
import kodillagoodpatterns.strategy.social.user.YGeneration;
import kodillagoodpatterns.strategy.social.user.ZGeneration;
import kodillagoodpatterns.strategy.social.user.publishery.SocialPublisher;
import kodillagoodpatterns.strategy.social.user.publishery.TwitterPublisher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void defaultTestSharingStrategies(){

        User millenials = new Millenials("John Facebook");
        User yGeneration = new YGeneration("George Twitter");
        User zGeneration = new ZGeneration("Yamal Snapchat");

        String johnUsing = millenials.sharePost();

        String georgeUsing = yGeneration.sharePost();

        String yamalUsing = zGeneration.sharePost();


        assertEquals("Facebook", millenials.sharePost());
        assertEquals("Twitter", yGeneration.sharePost());
        assertEquals("Snapchat", zGeneration.sharePost());
    }
    @Test
    void testIndividualSharingStrategy(){
        User user = new Millenials("John Millenials");

        String actual = user.sharePost();
        Assertions.assertEquals("John Millenials", actual);

        user.setSocialPublisher(new TwitterPublisher());
        String newPublisher = user.sharePost();
        Assertions.assertEquals("Twitter", newPublisher);

    }

}
