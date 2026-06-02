package java.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeesDAO {

    public static List<Employees> getEmployees() {
        List<Employees> list = new ArrayList<>();
        list.add(new Employees(176,"kite",600000L,"A","IT"));
        list.add(new Employees(388,"Angle",900000L,"A","CIVIL"));
        list.add(new Employees(470,"grow",400000L,"B","DEFENCE"));
        list.add(new Employees(624,"hdfc",200000L,"C","CORE"));
        list.add(new Employees(176,"axis",100000L,"D","SOCIAL"));
        return list;

    }
}
