package 객사오.다섯_번째_장.domain.employee;

import java.util.List;

public class Intern implements Employee{
    private int money;
    private List<Integer> attendance;
    private final String name;

    Intern(String name) {
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
