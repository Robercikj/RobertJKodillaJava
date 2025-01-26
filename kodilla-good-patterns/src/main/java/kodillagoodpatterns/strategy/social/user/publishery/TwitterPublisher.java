package kodillagoodpatterns.strategy.social.user.publishery;

public final class TwitterPublisher implements SocialPublisher {
    @Override
    public String share(){
        return "Twitter";
    }
}
