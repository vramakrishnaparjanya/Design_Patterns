import java.util.ArrayList;
import java.util.List;

public class EmployeeObject implements Cloneable{

    private List<String> empList;

    public EmployeeObject() {
        empList = new ArrayList<>();
    }

    public EmployeeObject(List<String> empList) {
        this.empList = empList;
    }

    public List<String> getEmpList() {
        return empList;
    }

    public void loadData(){
        //read all employees from database and put into the list
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<String>();
        for(String s : this.getEmpList()){
            temp.add(s);
        }
        return new EmployeeObject(temp);
    }
    
}
