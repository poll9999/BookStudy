package 객사오.다섯_번째_장.controller.system;

import java.util.HashMap;
import java.util.List;
import 객사오.다섯_번째_장.domain.employee.Employee;

public class GetSystem implements MySystem {
    @Override
    public HashMap<String, List<Integer>> getAttendance(List<Employee> employees) {
        HashMap<String, List<Integer>> map = new HashMap<>();
        for(Employee employee : employees){
            map.put(employee.getName(), employee.getAttendance());
        }

        return map;
    }

    @Override
    public HashMap<String, Integer> getMoney(List<Employee> employees) {
        HashMap<String, Integer> map = new HashMap<>();
        for(Employee employee : employees) {
            map.put(employee.getName(), employee.getMoney());
        }

        return map;
    }
}
