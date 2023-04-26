<느낀점>
코드를 짤 때 우선순위는
1.객체끼리 어떤식으로 협력되었는지
2.객체가 어떤 책임(역할)을 갖고있는지 이다.

장희가 팩토리 패턴에 대해 추천을 해주어 알게되었지만, 이 장과 팩토리 패턴은 거리가 좀 먼것 같다.
"구현"에 있어선 괜찮은듯.


---
<문제 생성>
당신은 이상한 나라의 엘리스라는 동화에 들어왔습니다.
당신의 판사입니다. 왕과 여왕중 당신이 하고싶은 것을 선택할 수 있습니다.
왕과 여왕중 어떤것을 택하시겠습니까?
=>왕
당신은 왕입니다. 목격자를 부르십시오.
현재 재판에 있는 목격자 :
=>목격자를 불러라.
토끼가 목격자를 불렀습니다.
재판을 진행하십시오.
=>증언하라.
목격자가 진술을 하였습니다.
증언이 마음에 들었습니까? (Y/N)
=>N
목격자가 법정에서 퇴출당했습니다.
다른 목격자를 불러 재판을 진행하거나, 재판을 끝내십시오.(Y/N)
=>N
재판이 종료되었습니다.

---
<역할 생성>
판사 : 왕 or 여왕
재판을 진행 할 수 있음.
토끼를 시켜 목격자를 부를 수 있음.
목격자에게 증언시킬 수 있음.
목격자를 내쫓을 수 있음.
재판을 종료 시킬 수 있음.

토끼 : 목격자를 부름

목격자 : 모자장수, 요리사 등
증언


---
<알게된 것>
    Factory Pattern
객체를 사용하는 코드에서 객체 생성 부분을 떼어내 추상화한 패턴.
상속관계에 있는 두 클래스에서 상위 클래스가 중요한 뼈대를 결정
하위 클래스에서 객체 생성에 관한 구체적인 내용을 결정함.
상위 클래스에선 인스턴스 생성 방식에 대해 전혀 알필요가 없기 떄문에 유연성이 증가함.
또한 객체생성 로직이 따로 떼어져 있기 떄문에 코드를 리팩터링하더라도 한 곳만 고칠 수 있게 되니 유지보수성이 증가

EX)
abstract class Coffee{
public abstract int getPrice();

	@Override
	public String toString() {
		return "Hi this coffee is " + this.getPrice();
	}
}

class CoffeeFactory{
    public static Coffee getCoffee(String type, int price) {
        if("Latte".equalsIgnoreCase(type))
        // 문자열 비교 기반으로 로직이 구성되어있는데, 이는 Enum 또는 Map을 이용하여 if문을 쓰지않고 매핑가능.
            return new Lattee(price);
        else if("Americano".equalsIgnoreCase(type))
            return new Americano(price);
        else {
            return enw DefaultCoffee();
        }
    }
}

class DefaultCoffee extends Coffee{
    private int price;

	public DefaultCoffee() {
		this.price = -1;
	}

	@Override
	public int getPrice() {
		return this.price;
	}
}

class Lattee extends Coffee{
    private int price;

	public Lattee(int price) {
		this.price = price;
	}
	
	@Override
	public int getPrice() {
		return this.price;
	}
}

class Americano extends Coffee{
    private int price;

	public Americano(int price) {
		this.price = price;
	}
	
	@Override
	public int getPrice() {
		return this.price;
	}
}

public class HelloWorld {
    public static void main(String[] args) {
        Coffee lattee = CoffeeFactory.getCoffee("Latte", 4000);
        Coffee ame = CoffeeFactory.getCoffee("Americano", 3000);
        System.out.println("Factory lattee ::"+latte);
        System.out.println("Factory ame ::"+ame);
    }
}

=> java.util package에 Calendar, ResourceBundle, NumberFormat등의 클래스에 정의된
getInstance() 메소드가 팩토리 패턴을 사용함.
Boolean, Integer, Long등의 Wrapper class 에 있는 valueOf() 또한 팩토리 패턴 사용.
