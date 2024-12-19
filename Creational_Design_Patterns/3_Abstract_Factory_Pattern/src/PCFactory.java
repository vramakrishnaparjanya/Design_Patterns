public class PCFactory implements ComputerAbstractFactory{

    private String ram;
    private String storage;
    private String cpu;

    public PCFactory(String ram, String storage, String cpu){
        this.ram=ram;
        this.storage=storage;
        this.cpu=cpu;
    }

    @Override
    public Computer createComputer() {
        System.out.println("Going to get PC");
        return new PC(ram, storage, cpu);
    }
}
