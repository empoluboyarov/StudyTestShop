package visitor;

import interfaces.VisitorInterface;

/**
 * Created by Evgeniy on 24.03.2016.
 */


public class BaseVisitor implements VisitorInterface{

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void buy() {

    }

    @Override
    public void returnGoods() {

    }
}
