package exam15;

public class BankAccount {
	private int balance;
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		if (amount > balance) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
			
		} else {
			balance -= amount;
		}
		
	}
	
	public int getBalance() {
		return balance;
	}

	public void printBalance() {
//		System.out.println("���� �ܾ�: "+balance);
		System.out.println("���� �ܾ�: "+getBalance());
	}
	
	public int addInterest() {
		return balance += (int)(balance*0.075);
	}
	
	
	
	
	
}
