package kodillagoodpatterns.prototype.library;

public class Prototype<B> implements Cloneable {
    @Override
    public B clone() throws CloneNotSupportedException {
        return (B) super.clone();
    }
}
