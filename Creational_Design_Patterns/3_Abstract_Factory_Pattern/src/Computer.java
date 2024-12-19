public abstract class Computer {

    public abstract String getRAM();
    public abstract String getStorage();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "***** RAM= "+ this.getRAM()+ ", Storage= "
                + this.getStorage()+ ", CPU= " + this.getCPU() + " *****";
    }

}
