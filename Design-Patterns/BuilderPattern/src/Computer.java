
public class Computer {
    // Required parameters
    private final String CPU;
    private final String RAM;

    // Optional parameters
    private final String storage;
    private final String graphicsCard;
    private final boolean isBluetoothEnabled;
    private final boolean isWiFiEnabled;

    // Private constructor
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isWiFiEnabled = builder.isWiFiEnabled;
    }

    // Builder Static Nested Class
    public static class Builder {
        private final String CPU;
        private final String RAM;

        private String storage;
        private String graphicsCard;
        private boolean isBluetoothEnabled;
        private boolean isWiFiEnabled;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder enableBluetooth(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Builder enableWiFi(boolean isWiFiEnabled) {
            this.isWiFiEnabled = isWiFiEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    // To display configuration
    public void showSpecs() {
        System.out.println("Computer Configuration:");
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("Storage: " + storage);
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("Bluetooth Enabled: " + isBluetoothEnabled);
        System.out.println("WiFi Enabled: " + isWiFiEnabled);
    }
}
