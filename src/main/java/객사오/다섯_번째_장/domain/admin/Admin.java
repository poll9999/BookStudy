package 객사오.다섯_번째_장.domain.admin;

import java.util.HashMap;
import 객사오.다섯_번째_장.domain.employee.Employee;

public interface Admin {
    HashMap<Employee, Integer> reWard(Employee employee, int count);
}
