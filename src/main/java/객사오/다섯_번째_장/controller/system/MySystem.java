package 객사오.다섯_번째_장.controller.system;

import java.util.HashMap;
import java.util.List;
import 객사오.다섯_번째_장.domain.employee.Employee;

public interface MySystem {

    HashMap<String, List<Integer>> getAttendance(List<Employee> employees);
    HashMap<String, Integer> getMoney(List<Employee> employees);
}
