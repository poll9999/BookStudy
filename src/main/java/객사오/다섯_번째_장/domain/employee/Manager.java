package 객사오.다섯_번째_장.domain.employee;

import java.util.List;

public class Manager implements Employee{ //과장
    private int money = 0;
    private List<Integer> attendance;
    private final String name;

    Manager(String name) {
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
}
