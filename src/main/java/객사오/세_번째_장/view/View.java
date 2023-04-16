package 객사오.세_번째_장.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class View {
    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void youAreAlice() {
        System.out.println("당신은 이상한 나라의 엘리의 엘리스입니다.");
        System.out.println("우여곡절 끝에 정원에 들어온 당신은 정원사, 병사, 신하,"
                + "왕자와 공주, 하객으로 참석한 왕과 왕비, 하트 잭, 하트 왕, 하트 여왕, 토끼를 보았습니다.");
        System.out.println("그 중 하나를 선택하고, 스무고개를 통해 맞추는 작업을 진행하겠습니다.");
    }

    public String rabbitOrTrump() throws IOException {
        System.out.println("1. 납작 엎드릴 수 있고, 뒤집어질 수 있습니까? (맞으면 O, 틀리면 X)");
        return br.readLine();
    }

    public String trumpOrTrumpMan() throws IOException {
        System.out.println("2. 트럼프가 아니면 트럼프 인간이겠네요!");
        System.out.println("걸을 때마다 몸이 종이처럼 좌우로 펄럭이나요? (맞으면 O, 틀리면 X)");
        return br.readLine();
    }

    public String isGardener() throws IOException {
        System.out.println("3. 트럼프 인간이네요!");
        System.out.println("지금 장미꽃을 붉게 칠하고 있나요?");
        return br.readLine();
    }

    public String isSolider() throws IOException {
        System.out.println("4. 클로버를 들고 있나요?");
        return br.readLine();
    }

    public String isCourtier() throws IOException {
        System.out.println("5. 다이아몬드로 치장했나요?");
        return br.readLine();
    }

    public String isPrinceOrPrincess() throws IOException {
        System.out.println("6. 두 명씩 손을 잡고 깡총거리고 있나요?");
        return br.readLine();
    }

    public String isGuestKing() throws IOException {
        System.out.println("7. 열을 지어 걸어오고 있나요?");
        return br.readLine();
    }

    public String isJack() throws IOException {
        System.out.println("8. 잭 카드를 들고 있나요?");
        return br.readLine();
    }

    public String isKing() throws IOException {
        System.out.println("9. 킹 카드를 들고 있나요?");
        return br.readLine();
    }

    public String isQueen() throws IOException {
        System.out.println("10. 퀸 카드를 들고 있나요?");
        return br.readLine();
    }

    public void rabbitSpecialization(boolean check) {
        System.out.print("토끼(Rabbit)는 보고 있는 것 중 유일하게 뒤집어질 수 없습니다(" + check +").");
    }

    public void cardSpecialization(boolean check) {
        System.out.println("트럼프 카드(Trump Card)는 뒤집어질 수 있지만, 걸을 수 없습니다(" + check +").");
    }

    public void gardnerSpecialization(boolean check) {
        System.out.println("정원사(Gardner)는 트럼프 인간이고, 장미꽃을 붉게 칠하고 있습니다(" + check +").");
    }

    public void soldierSpecialization(boolean check) {
        System.out.println("병사(Soldier)는 트럼프 인간이고, 클로버를 들고 있습니다(" + check +").");
    }

    public void courtierSpecialization(boolean check) {
        System.out.println("신하(Courtier)는 트럼프 인간이고, 다이아를 들고 있습니다(" + check +").");
    }

    public void princeSpecialization(boolean check) {
        System.out.println("왕자와 공주(Prince or Princess)는 트럼프 인간이고, 손을 잡고 깡총 거리고 있습니다(" + check +").");
    }

    public void GuestSpecialization(boolean check) {
        System.out.println("하객으로 온 왕과 왕비(Guest King Or Queen)는 트럼프 인간이고, 열을 지어 걷고 있습니다(" + check +").");
    }

    public void JackSpecialization(boolean check) {
        System.out.println("하트 잭(Heart Jack)은 트럼프 인간이고, 잭 카드를 들고 있습니다(" + check +").");
    }

    public void KingSpecialization(boolean check) {
        System.out.println("하트 킹(Heart King)은 트럼프 인간이고, 킹 카드를 들고 있습니다(" + check +").");
    }

    public void QueenSpecialization(boolean check) {
        System.out.println("하트 퀸(Heart Queen)은 트럼프 인간이고, 퀸 카드를 들고 있습니다(" + check +").");
    }
    public void answer(String s) {
        System.out.println("당신은 " + s + "을(를) 선택하였습니다.");
    }
}
