package Week_1_Design_Principles_and_Patterns_HandsOn.BuilderPatternExample;




public class Main {
    public static void main(String[] args) {
        
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setWiFi(true)
                .setBluetooth(true)
                .build();

        gamingComputer.showSpecs();

        
        Computer officeComputer = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("8GB")
                .setStorage("512GB HDD")
                .setWiFi(true)
                .setBluetooth(false)
                .build();

        officeComputer.showSpecs();
    }
}