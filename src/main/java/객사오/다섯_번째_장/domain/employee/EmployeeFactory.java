package 객사오.다섯_번째_장.domain.employee;

import java.util.HashMap;

import static 객사오.다섯_번째_장.domain.employee.EmployeeRole.ASSISTANT;
import static 객사오.다섯_번째_장.domain.employee.EmployeeRole.GM;
import static 객사오.다섯_번째_장.domain.employee.EmployeeRole.INTERN;
import static 객사오.다섯_번째_장.domain.employee.EmployeeRole.MANAGER;

public class EmployeeFactory {
    private static final HashMap<String, Employee> employeeMap = new HashMap<>();

    public static Employee registerEmployee(String name, String role) {
        employeeMap.put(ASSISTANT.getRole(), new Assistant(name));
        employeeMap.put(GM.getRole(), new GM(name));
        employeeMap.put(INTERN.getRole(), new Intern(name));
        employeeMap.put(MANAGER.getRole(), new Manager(name));

        return employeeMap.get(role);
    }
}
