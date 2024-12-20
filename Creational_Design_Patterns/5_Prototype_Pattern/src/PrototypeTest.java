import java.util.Arrays;
import java.util.List;

public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        EmployeeObject employeeObject = new EmployeeObject();
        employeeObject.loadData();
        List<String> empList = employeeObject.getEmpList();

        System.out.println("Original list -->"+ empList);

        //Cloning the object to new object and making modification
        EmployeeObject clone = (EmployeeObject) employeeObject.clone();
        List<String> clonedList = clone.getEmpList();
        clonedList.remove("Raj");

        System.out.println("Clone list -->"+ clonedList);

    }
}
