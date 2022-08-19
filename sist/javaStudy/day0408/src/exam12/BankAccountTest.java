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
		System.out.println(amount + "�� �����Ͽ� �ܾ��� "+balance+"�� �Ǿ����ϴ�.");
	}

	public void withdraw(int amount) throws NegativeBalanceException {
		if (amount > balance) {
			throw new NegativeBalanceException("���� �ݾ��� �ܾ׺��� Ů�ϴ�.");
		}
		
		balance -= amount;
		System.out.println(amount + "�� �����Ͽ� �ܾ��� "+balance+"�� �Ǿ����ϴ�.");
		
		
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
			System.out.println("�ܾ�: "+ba.getBalance());

		} catch (NegativeBalanceException e) {
			System.out.println("���� �߻�: " + e.getMessage());
		} 

	}

}
