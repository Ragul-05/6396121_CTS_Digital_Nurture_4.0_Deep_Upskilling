package Design_Principles_and_Patterns.ProxyPatternExample;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromServer();  // Simulate expensive operation
    }

    private void loadFromServer() {
        System.out.println("Loading image from server: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying: " + filename);
    }
}