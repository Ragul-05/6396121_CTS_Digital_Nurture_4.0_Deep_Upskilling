package Week_1_Design_Principles_and_Patterns_HandsOn.FactoryMethodPatternExample;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a PDF document.");
    }
}