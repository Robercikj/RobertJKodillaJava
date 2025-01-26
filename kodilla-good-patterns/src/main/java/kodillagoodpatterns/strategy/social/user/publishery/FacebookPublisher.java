package kodillagoodpatterns.strategy.social.user.publishery;

public final class FacebookPublisher implements SocialPublisher {
    @Override
    public String share(){
        return "Facebook";
    }
}
