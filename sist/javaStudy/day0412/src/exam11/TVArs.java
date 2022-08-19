package exam11;

// 모금액을 위한 클래스
class Account {
	// 잔액을 위한 변수
	private int balance;

	// 입금을 위한 메소드 정의
	// balance는 한 번에 하나의 Thread에게만 접근하도록 하기 위하여 synchronized 키워드를 붙여 임계영역으로 설정
	public synchronized void deposit(String name, int amount) {
		// 입급할 금액을 매개변수로 전달받아 잔액에 누적
		balance += amount;

		System.out.println(name + "이(가) " + amount + "원을 입금하여 잔액이 " + balance + "원이 되었습니다.");
	}

	// 현재 잔액을 반환하는 메소드
	public int getBalance() {
		return balance;
	}
}

//성금자를 위한 클래스 정의
// 각각의 성금자들은 서로 영향을 끼치지 않고 돈을 보내도록 하기 위하여 Thread로 구현
class Contributor extends Thread {
	// 성금자를 구별하기 위하여 이름을 멤버변수로 선언
	private String name;

	// 모금액 클래스의 객체를 멤버변수로 가진다.
	private Account account;

	// 생성 시에 모금 액 객체 전달 받음
	public Contributor(String name, Account account) {
		this.name = name;
		this.account = account;
	}

	// run을 오버라이딩하여 쓰레드가 해야 하는 일을 써준다.
	// 이 쓰레드(성금자)들은 경쟁적으로 모금액이 500000원이 될 때까지 돈을 입금한다.
	public void run() {
		while (true) {

			if (account.getBalance() >= 500000) {
				break;
			}
			account.deposit(name, 1000);
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
	}
}
// Account 와 Contributor은 has-a 관계
public class TVArs {
	public static void main(String[] args) {

		// 모금액 계좌 객체 생성
		Account account = new Account();

		// 이꼐좌를 공유하는 5명의 성금자 객체 생성
		Contributor c1 = new Contributor("김소윤", account);
		Contributor c2 = new Contributor("고민지", account);
		Contributor c3 = new Contributor("서동혁", account);
		Contributor c4 = new Contributor("고주희", account);
		Contributor c5 = new Contributor("송승민", account);

		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();

		// c1, c2,c3,c4,c5 thread가 끝날 때 까지 기다리도록 한다.
		try {
			c1.join();
			c2.join();
			c3.join();
			c4.join();
			c5.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("최종 모금액: " + account.getBalance());

	}
}
