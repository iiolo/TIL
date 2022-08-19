package exam12;

class NegativeBalanceException extends Exception {
	public NegativeBalanceException(String msg) {
		super(msg);
	}

}

class BankAccount {

	int balance;

	public void deposit(int amount) {
		balance += amount;
		System.out.println(amount + "를 저금하여 잔액이 "+balance+"가 되었습니다.");
	}

	public void withdraw(int amount) throws NegativeBalanceException {
		if (amount > balance) {
			throw new NegativeBalanceException("인출 금액이 잔액보다 큽니다.");
		}
		
		balance -= amount;
		System.out.println(amount + "를 인출하여 잔액이 "+balance+"가 되었습니다.");
		
		
	}
	
	public int getBalance() {
		return balance; 
	}

}

public class BankAccountTest {

	public static void main(String[] args) {
		try {
			BankAccount ba = new BankAccount();
			ba.deposit(1000);
			ba.withdraw(500);
			ba.withdraw(700);
			System.out.println("잔액: "+ba.getBalance());

		} catch (NegativeBalanceException e) {
			System.out.println("예외 발생: " + e.getMessage());
		} 

	}

}
