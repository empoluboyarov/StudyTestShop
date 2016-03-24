import java.util.ArrayList;

/**
 * Created by Evgeniy on 24.03.2016.
 */
public interface DepartmentInterface {

    String getName();

    ArrayList<EmployeeInterface> getEmployeeList();

    ArrayList<GoodsInterface> getGoodsList();

}
