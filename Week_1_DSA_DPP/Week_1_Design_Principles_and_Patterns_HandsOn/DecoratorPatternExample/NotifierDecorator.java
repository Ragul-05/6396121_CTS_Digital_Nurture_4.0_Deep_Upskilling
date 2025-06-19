package Week_1_Design_Principles_and_Patterns_HandsOn.DecoratorPatternExample;

public abstract class NotifierDecorator implements Notifier {
    protected Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        notifier.send(message); 
    }
}
