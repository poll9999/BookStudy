package 객사오.다섯_번째_장.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import 객사오.다섯_번째_장.domain.employee.Employee;
import 객사오.다섯_번째_장.domain.employee.EmployeeFactory;
import 객사오.다섯_번째_장.domain.employee.GM;
import 객사오.다섯_번째_장.controller.system.GetSystem;
import 객사오.다섯_번째_장.view.View;

public class Controller {
    static int index;
    static Employee employee;
    static List<String> personInfo = new ArrayList<>();
    static final View view = new View();
    static final GetSystem getSystem = new GetSystem();
    static final List<Employee> employees = new ArrayList<>();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        do {
            inputInfo();
            inputAttend();
            index = doSystem();
        } while (exitSystem() != 5);
    }

    private static void inputInfo() throws IOException {
        view.whoAreYou();
        inputToList();
        employee = EmployeeFactory.registerEmployee(personInfo.get(1), personInfo.get(2));
        // 개인 정보 입력(아이디, 이름, 직급)
    }

    private static void inputAttend() throws IOException {
        view.myAttendance();
        inputToList();
        int money = calculateMoney(StrToIntList(personInfo));
        setEmployee(StrToIntList(personInfo), money);
        employees.add(employee);
        // 개인 출석일수 입력 받음
    }

    private static int doSystem() throws IOException {
        do {
            view.chooseFun();
            index = Integer.parseInt(br.readLine());

            showMine();
            showEmployees();
            showReward();

        } while (index != 0);
        return index;
    }

    private static int exitSystem() throws IOException {
        if (index == 0) {
            view.outputExit();
            index = Integer.parseInt(br.readLine());
        }
        return index;
    }

    private static void setEmployee(List<Integer> attend, int money) {
        employee.setAttendance(attend);
        employee.setMoney(money);
    }

    private static List<Integer> StrToIntList(List<String> list) {
        return list.stream().map(Integer::parseInt).collect(Collectors.toList());
    }

    private static void inputToList() throws IOException {
        personInfo = Arrays.asList(br.readLine().split(" "));
    }

    private static void showMine() {
        if (index == 1) {
            view.getWork(employee.getAttendance(), employee.getMoney());
        }
    }

    private static void showEmployees() {
        if (index == 2) {
            view.onlyGM();
            if (employee.isGM()) {
                outputInfo();
            }
        }
    }

    private static void showReward() throws IOException {
        if (index == 3) {
            view.onlyGM();
            if (employee.isGM()) {
                Employee find = findEmployee();
                rewardEmployee(find);
            }
        }
    }

    private static int rewardValue(GM gm, Employee find, int count) {
        return gm.reWard(find, count).values().stream().findFirst().orElse(0);
    }

    private static void setReward(GM gm, Employee find, int count) {
        find.setMoney(find.getMoney()+ rewardValue(gm, find, count));
    }

    private static void rewardEmployee(Employee find) throws IOException {
        view.getRewardMoney();
        int count = Integer.parseInt(br.readLine());
        GM gm = (GM) employee;
        setReward(gm, find, count);
        employees.add(find);
    }

    private static Employee findEmployee() throws IOException {
        view.getReward();
        System.out.println(getSystem.getMoney(employees));
        String s = br.readLine();
        return findName(s);
    }

    private static void outputInfo() {
        view.outputInfo(getSystem.getAttendance(employees), getSystem.getMoney(employees));
    }

    private static int calculateMoney(List<Integer> list) {
        return (list.get(0) - (list.get(1) + list.get(2)) / 2) * 100000;
    }

    private static Employee findName(String name) {
        return Controller.employees.stream()
                .filter(employee -> employee.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
