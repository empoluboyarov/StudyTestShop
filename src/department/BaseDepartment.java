package department;

import com.sun.org.apache.xpath.internal.SourceTree;
import interfaces.DepartmentInterface;
import interfaces.EmployeeInterface;
import interfaces.GoodsInterface;

import java.util.ArrayList;

/**
 * Created by Evgeniy on 24.03.2016.
 */
public abstract class BaseDepartment implements DepartmentInterface {


    private String name;

    private ArrayList<EmployeeInterface> employeeList;

    private ArrayList<GoodsInterface> goodsList;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeList(ArrayList<EmployeeInterface> employeeList) {
        this.employeeList = employeeList;
    }

    public void setGoodsList(ArrayList<GoodsInterface> goodsList) {
        this.goodsList = goodsList;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<EmployeeInterface> getEmployeeList() {
        return employeeList;
    }

    @Override
    public ArrayList<GoodsInterface> getGoodsList() {
        return goodsList;
    }
}
