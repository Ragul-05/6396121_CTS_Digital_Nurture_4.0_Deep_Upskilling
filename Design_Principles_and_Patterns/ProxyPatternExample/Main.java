package Design_Principles_and_Patterns.ProxyPatternExample;

public class Main {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("nature.jpg");
        Image img2 = new ProxyImage("city.jpg");

        img1.display();  
        System.out.println();

        img1.display();  
        System.out.println();

        img2.display();
        
    }
}