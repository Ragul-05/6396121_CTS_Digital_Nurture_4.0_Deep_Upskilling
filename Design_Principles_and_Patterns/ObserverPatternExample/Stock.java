package Design_Principles_and_Patterns.ObserverPatternExample;

public interface Stock {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}