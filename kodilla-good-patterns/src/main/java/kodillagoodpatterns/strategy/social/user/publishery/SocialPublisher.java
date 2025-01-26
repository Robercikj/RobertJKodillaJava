package kodillagoodpatterns.strategy.social.user.publishery;

public sealed interface SocialPublisher
permits FacebookPublisher, SnapchatPublisher, TwitterPublisher{

     String share();

}
