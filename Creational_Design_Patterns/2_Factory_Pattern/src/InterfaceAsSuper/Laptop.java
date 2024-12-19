package InterfaceAsSuper;

public class Laptop implements Interface_Computer {

    private String ram;
    private String storage;
    private String cpu;

    public Laptop(String ram, String storage, String cpu){
        this.ram=ram;
        this.storage=storage;
        this.cpu=cpu;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getStorage() {
        return this.storage;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

    @Override
    public String toString(){
        return "***** RAM= "+ this.getRAM()+ ", Storage= "
                + this.getStorage()+ ", CPU= " + this.getCPU() + " *****";
    }
}
