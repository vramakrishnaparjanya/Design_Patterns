public class LaptopFactory implements ComputerAbstractFactory{

    private String ram;
    private String storage;
    private String cpu;

    public LaptopFactory(String ram, String storage, String cpu){
        this.ram=ram;
        this.storage=storage;
        this.cpu=cpu;
    }

    @Override
    public Computer createComputer() {
        System.out.println("Going to get Laptop");
        return new Laptop(ram, storage, cpu);
    }
}
