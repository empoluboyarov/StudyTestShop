package service;

import interfaces.DepartmentInterface;
import interfaces.EmployeeInterface;

/**
 * Created by Evgeniy on 24.03.2016.
 */
public abstract class BaseEmployee implements EmployeeInterface {

    private String name;

    private DepartmentInterface department;

    private boolean free;

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(DepartmentInterface department) {
        this.department = department;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public DepartmentInterface getDepartment() {
        return department;
    }

    @Override
    public boolean isFree() {
        return free;
    }
}
