package 객사오.네_번째_장.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;

public class View {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void youAreJudge() {
        System.out.println("당신은 이상한 나라의 엘리스라는 동화에 들어왔습니다.");
        System.out.println("당신은 판사입니다. 왕과 여왕중 당신이 하고 싶은 것을 선택할 수 있습니다.");
        System.out.println("왕과 여왕중 어떤 것을 택하시겠습니까?");
    }

    public String startTrial(String kingOrQueen, Collection<String> data) throws IOException {
        System.out.println("당신은 " + kingOrQueen + "입니다. 목격자를 부르십시오.(" +data.toString()+" 중 선택하십시오.)");
        return br.readLine();
    }

    public void callRabbitToTrial(String WitnessRole) throws IOException {
        System.out.println("토끼가 " + WitnessRole + "을(를) 불렀습니다.");
        System.out.println("재판을 진행하십시오.");
        br.readLine();
    }

    public String likeOrDislike(String witness) throws IOException {
        System.out.println(witness + "가(이) 진술을 하였습니다.");
        System.out.println("증언이 마음에 들었습니까?(Y/N)");
        return br.readLine();
    }

    public void byeByeWitness(String witness) {
        System.out.println(witness + "가 법정에서 퇴출당했습니다.");
    }

    public String OKWitness() throws IOException {
        System.out.println("다른 목격자를 불러 재판을 진행하거나, 재판을 끝내십시오.(Y/N)");
        return br.readLine();
    }
    public void noWitness() {
        System.out.println("더 이상 증언할 증인이 법정에 없습니다.");
    }

    public void endTrial() {
        System.out.println("재판이 종료되었습니다.");
    }

    public void hatterSay() {
        System.out.println("전 아무것도 몰라요");
    }

    public void chefSay() {
        System.out.println("증언하기 싫은데요");
    }

    public void aliceSay() {
        System.out.println("모자 장수가 범인입니다");
    }

    public void inTrialNow(Collection<String> data) {
        System.out.println("현재 재판에 있는 증인들은 " + data + " 입니다.");
    }

}
