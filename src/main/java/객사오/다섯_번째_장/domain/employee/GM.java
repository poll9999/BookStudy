package 객사오.다섯_번째_장.domain.employee;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import 객사오.다섯_번째_장.domain.admin.Admin;

public class GM implements Employee, Admin { // 부장
    private int money;
    private List<Integer> attendance;
    private final String name;

    GM(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public int getMoney() {
        return this.money;
    }

    @Override
    public void setAttendance(List<Integer> attendance) {
        this.attendance = attendance;
    }

    @Override
    public List<Integer> getAttendance() {
        return this.attendance;
    }

    @Override
    public HashMap<Employee, Integer> reWard(Employee employee, int count) {
        return Stream.of(new AbstractMap.SimpleEntry<>(employee, count))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, HashMap::new));
    }
}
