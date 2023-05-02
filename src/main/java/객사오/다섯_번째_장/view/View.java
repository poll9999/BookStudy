package 객사오.다섯_번째_장.view;

import java.util.HashMap;
import java.util.List;

public class View {
    public void whoAreYou() {
        System.out.println("당신의 인적정보를 입력하세요.(아이디, 이름, 직급 순)\n");
    }

    public void myAttendance() {
        System.out.println("당신의 이번달 출근일수를 입력하세요.");
        System.out.println("출근, 지각, 조퇴 순입니다. 없는 부분은 0으로 입력해주세요\n");
    }

    public void chooseFun() {
        System.out.println("사용할 기능을 선택하세요.(0, 1, 2, 3)");
        System.out.println("0. 시스템 종료");
        System.out.println("1. 본인의 출결과 수당을 조회");
        System.out.println("2. 직원들의 출결과 수당을 조회");
        System.out.println("3. 성과금 증여\n");
    }

    public void getWork(List<Integer> list, int money) {
        System.out.println("출근은 "+list.get(0)+", 지각은 "+list.get(1)+", 조퇴는 "+list.get(2)+"이므로");
        System.out.println(money + "(이)가 이번달월급입니다 \n");
    }

    public void onlyGM() {
        System.out.println("이 기능은 부장만 사용 가능한 기능입니다.\n");
    }

    public void getReward() {
        System.out.println("성과금을 지급할 사람을 선택하세요.\n");
    }

    public void getRewardMoney() {
        System.out.println("성과금을 입력해주세요\n");
    }
    public void outputInfo(HashMap<String, List<Integer>> attend, HashMap<String, Integer> money) {
        System.out.println(attend);
        System.out.println(money+"\n");
    }

    public void outputExit() {
        System.out.println("종료하시겠습니까? 종료할려면 5번을, 아니면 5번이 아닌 다른 숫자를 입력하세요.");
    }
}
