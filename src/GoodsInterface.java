/**
 * Created by Evgeniy on 24.03.2016.
 */
public interface GoodsInterface {

    double getPrice();

    boolean hasGuarantee();

    String getName();

    DepartmentInterface getDepartment();

    String getCompany();
}
