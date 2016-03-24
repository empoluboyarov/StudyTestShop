import interfaces.DepartmentInterface;
import interfaces.VisitorInterface;
import service.Administrator;

import java.util.ArrayList;

/**
 * Created by Evgeniy on 24.03.2016.
 */
public class SalesRoom {

    private String name;

    private Administrator administrator;

    private ArrayList<VisitorInterface> visitorList;

    private ArrayList<DepartmentInterface> departmentList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

    public ArrayList<VisitorInterface> getVisitorList() {
        return visitorList;
    }

    public void setVisitorList(ArrayList<VisitorInterface> visitorList) {
        this.visitorList = visitorList;
    }

    public ArrayList<DepartmentInterface> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(ArrayList<DepartmentInterface> departmentList) {
        this.departmentList = departmentList;
    }
}
