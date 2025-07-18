public class Main {
    public static void main(String[] args) {
        // Basic configuration
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB")
            .build();
        basicComputer.showSpecs();

        System.out.println();

        // High-end configuration
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
            .setStorage("1TB SSD")
            .setGraphicsCard("NVIDIA RTX 4080")
            .enableBluetooth(true)
            .enableWiFi(true)
            .build();
        gamingComputer.showSpecs();
    }
}
