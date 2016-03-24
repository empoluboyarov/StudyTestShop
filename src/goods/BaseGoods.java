package goods;

import interfaces.DepartmentInterface;
import interfaces.GoodsInterface;

/**
 * Created by Evgeniy on 24.03.2016.
 */
public class BaseGoods implements GoodsInterface{

    private double price;
    private boolean hasGuarantee;
    private String name;
    private String company;
    private DepartmentInterface department;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setHasGuarantee(boolean hasGuarantee) {
        this.hasGuarantee = hasGuarantee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setDepartment(DepartmentInterface department) {
        this.department = department;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean hasGuarantee() {
        return hasGuarantee;
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
    public String getCompany() {
        return company;
    }
}
