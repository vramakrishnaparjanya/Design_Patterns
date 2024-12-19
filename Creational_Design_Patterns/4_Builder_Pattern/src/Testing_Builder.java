public class Testing_Builder {
    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
//                .setBluetoothEnabled("true")
//                .setGraphicsCardEnabled("true")
                .build();
        System.out.println("Computer RAM--> "+ comp.getRAM());
        System.out.println("Computer HDD--> "+ comp.getHDD());
        System.out.println("Computer Bluetooth--> "+ comp.isBluetoothEnabled());
        System.out.println("Computer Graphics--> "+ comp.isGraphicsCardEnabled());
    }
}
