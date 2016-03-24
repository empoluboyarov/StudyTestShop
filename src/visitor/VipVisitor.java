package visitor;

import visitor.BaseVisitor;

/**
 * Created by Evgeniy on 24.03.2016.
 */
public class VipVisitor extends BaseVisitor {

    float discount;

    private boolean checkDiscount(){
        return discount>0;
    }

    @Override
    public void buy() {
        if (!checkDiscount())
            super.buy();
        else {
            // специфичная реализация метода
        }
    }
}
