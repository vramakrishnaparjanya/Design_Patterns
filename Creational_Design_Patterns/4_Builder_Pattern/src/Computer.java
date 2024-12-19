public class Computer {
    //required parameters
    private String HDD;
    private String RAM;

    //optional parameters or nullable
    private String isGraphicsCardEnabled;
    private String isBluetoothEnabled;

    private Computer(ComputerBuilder builder) {
        this.HDD=builder.HDD;
        this.RAM=builder.RAM;
        this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled=builder.isBluetoothEnabled;
    }

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public String isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public String isBluetoothEnabled() {
        return isBluetoothEnabled;
    }


    public static class ComputerBuilder {

        //required parameters
        private String HDD;
        private String RAM;

        //optional parameters or nullable
        private String isGraphicsCardEnabled;
        private String isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram){
            this.HDD=hdd;
            this.RAM=ram;
        }

        public ComputerBuilder setBluetoothEnabled(String bluetoothEnabled) {
            this.isBluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public ComputerBuilder setGraphicsCardEnabled(String graphicsCardEnabled) {
            this.isGraphicsCardEnabled = graphicsCardEnabled;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }

}
