package AbstractClassAsSuper;

public class FactoryClass {

    public static SuperAbstractClass_Computer getComputer(String comp_type, String ram, String storage, String cpu)
    {
        if("PC".equalsIgnoreCase(comp_type))
            return new PC(ram, storage, cpu);

        else if("Laptop".equalsIgnoreCase(comp_type))
            return new Laptop(ram, storage, cpu);

        return null;
    }

    public static void main(String[] args) {

        // Get Laptop
        SuperAbstractClass_Computer laptop = FactoryClass.getComputer("laptop", "2GB", "5TB", "2.4HZ");

        // Get PC
        SuperAbstractClass_Computer pc = FactoryClass.getComputer("pc", "8GB", "15TB", "5HZ");

        System.out.println("Laptop config  --> "+ laptop);
        System.out.println("PC config  --> "+ pc);

    }

}
