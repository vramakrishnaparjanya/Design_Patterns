public class Testing {

    public static void main(String[] args) {

        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        System.out.println("AbstractFactory PC Config::"+pc);
        Computer laptop = ComputerFactory.getComputer(new LaptopFactory("16 GB","1 TB","2.9 GHz"));
        System.out.println("AbstractFactory Laptop Config::"+laptop);

    }

}
