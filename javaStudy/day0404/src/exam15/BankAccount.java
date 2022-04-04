package exam15;

public class BankAccount {
	private int balance;
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		if (amount > balance) {
			System.out.println("잔액이 부족합니다.");
			return;
			
		} else {
			balance -= amount;
		}
		
	}
	
	public int getBalance() {
		return balance;
	}

	public void printBalance() {
//		System.out.println("현재 잔액: "+balance);
		System.out.println("현재 잔액: "+getBalance());
	}
	
	public int addInterest() {
		return balance += (int)(balance*0.075);
	}
	
	
	
	
	
}
