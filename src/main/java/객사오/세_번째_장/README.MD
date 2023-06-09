<느낀점>

타입은 객체의 분류와 관련이 있으며, 객체들간의 관계를 표현함.

추상화는 타입을 정의하고 분류하는 과정으로, 중요하지 않은 부분을 제거하여 서로 공통점을 일반화 함.


Controller 에
추상화 메소드 boolean askQuestion(String, String, String) 을 추가하여
view.answer(getRole) 과 view.roleSpecialization 을 추가하여 반복되는 코드를 줄일 수 있었을 것 같다.

EX)
private static boolean askQuestion(String question, String yesOption, String noOption) throws IOException {
   String answer = view.askQuestion(question, yesOption, noOption);
   if (answer.equals(yesOption)) {
      view.answer(getRole());
      view.showSpecialization(getSpecialization());
      return true;
   } else if (answer.equals(noOption)) {
      return false;
   } else {
      System.out.println("잘못된 입력입니다.");
      System.exit(0);
      return false;
   }
}

---
<문제 생성>

당신은 이상한 나라의 엘리의 엘리스입니다.

우여곡절 끝에 정원에 들어온 당신은 트럼프 카드, 정원사, 병사, 신하, 왕자와 공주, 하객으로 참석한 왕과 왕비, 하트 잭, 하트 왕, 하트 여왕, 토끼를 보았습니다.

그 중 하나를 선택하고, 스무고개를 통해 맞추는 작업을 진행하겠습니다.

1. 납작 엎드릴 수 있고, 뒤집어질 수 있습니까? (맞으면 O, 틀리면 X)
   O


2. 트럼프가 아니면 트럼프 인간이겠네요!
   걸을 때마다 몸이 종이처럼 좌우로 펄럭이나요? (맞으면 O, 틀리면 X)
   O


3. 트럼프 인간이네요!
   지금 장미꽃을 붉게 칠하고 있나요? //정원사
   X


4. 클로버를 들고 있나요? //병사
   X


5. 다이아몬드로 치장했나요? //신하
   X


6. 두 명씩 손을 잡고 깡총거리고 있나요? //왕자와 공주
   X


7. 열을 지어 걸어오고 있나요? //하객으로 참석한 왕과 왕비
   X


8. 잭 카드를 들고 있나요? //하트 잭
   X


9. 킹 카드를 들고 있나요? //하트 킹
   X


10. 퀸 카드를 들고 있나요? //하트 퀸
    O

=> 당신은 하트 여왕을 선택하였습니다.
하트 퀸(Heart Queen)은 트럼프 인간이고, 퀸 카드를 들고 있습니다. (true)

---
<역할 생성>
1. Enum 타입을 생성하여 트럼프 카드, 토끼, 트럼프 인간들을 표현해야 함.


2. 각 객체들마다 isValid() 메소드들을 만들어, 일반적인 내용을 포함되지만, 특수화 되는 개념들을 표현해야 함.


3. 트럼프 카드, 토끼, 트럼프 인간 3가지를 추상 클래스로 만들어서 일반화(추상화).


4. 2장에서도 나온 내용인 "대학교에 있는 학교 모니터와, 집에 있는 모니터는 같은 객체(모니터) 이다."
   가 이번 장에서도 나왔음. 중복이기 때문에 보류


5. 즉, 4번에서 강조했듯이, "타입"은 시간에 따른 객체의 상태(동적 상태) 변경이라는 복잡성을 단순화 한다.
   라는 내용은 보류함.