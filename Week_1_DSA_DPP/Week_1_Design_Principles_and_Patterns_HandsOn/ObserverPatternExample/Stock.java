package Week_1_Design_Principles_and_Patterns_HandsOn.ObserverPatternExample;

public interface Stock {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}