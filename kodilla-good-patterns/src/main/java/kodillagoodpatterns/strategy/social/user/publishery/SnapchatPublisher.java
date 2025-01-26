package kodillagoodpatterns.strategy.social.user.publishery;

public final class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share(){
        return "Snapchat";
    }
}
