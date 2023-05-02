package 객사오.다섯_번째_장.domain.employee;

import java.util.List;

public interface Employee {
    default boolean isGM(){
        return this.getClass().equals(GM.class);
    }

    String getName();
    void setMoney(int money);
    int getMoney();
    void setAttendance(List<Integer> attendance);
    List<Integer> getAttendance();
}
