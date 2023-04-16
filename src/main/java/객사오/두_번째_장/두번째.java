package 객사오.두_번째_장;

public class 두번째 {
    /**
     * 1. 객체는 "메세지"를 받으면, 행동을 통해 상태를 변경함.(Response)
     * <p>
     * 2. 객체는 자율 적인 존재. 외부에서 직접 접근 불가. 객체가 제공하는 메세지를 통해서만 응답-요청 가능.
     * <p>
     * 3. 캡슐화. 유지보수와 코드 확장성을 높임.
     *
     * 4. 음료는 자
     */
    public static void main(String[] args) {
        Drink drink = new Drink(20);
        Mushroom mushroom = new Mushroom(15);
        Door door = new Door(135);

        Person alice = new Person(160);
        Person A = new Person(alice.getHeight());


        alice.drink(drink);
        while (!door.checkHeight(alice)) {
            alice.eat(mushroom);
        }

        Person B = alice;
        int b = B.getHeight();

        System.out.println(alice.getHeight());

        boolean personCheck = (A == B);

        System.out.println(A.getHeight()+" " + B.getHeight());
        System.out.println("서로" + personCheck + "사람이다");

        //System.out.println(alice.getSumHeight());
    }

    private static class Person {
        private int height;

        private Person(int height) {
            this.height = height;
        }

        private void drink(Drink drink) { //link
            height += drink.getSumHeight();
        }

        private void eat(Mushroom mushroom) { //link
            height -= mushroom.getMinusHeight();
        }

        private int getHeight() {
            return height;
        }
    }

    private static class Door {
        private final int doorHeight;
        private Door(int doorHeight) {
            this.doorHeight = doorHeight;
        }

        private int getDoorHeight() {
            return doorHeight;
        }

        private boolean checkHeight(Person person) { //link
            return person.getHeight() <= getDoorHeight();
        }
    }

    private static class Drink {
        private final int sumHeight;

        private Drink(int sumHeight) {
            this.sumHeight = sumHeight;
        }

        private int getSumHeight() {
            return sumHeight;
        }
    }

    private static class Mushroom {
        private final int minusHeight;

        private Mushroom(int minusHeight) {
            this.minusHeight = minusHeight;
        }

        private int getMinusHeight() {
            return minusHeight;
        }
    }
}
