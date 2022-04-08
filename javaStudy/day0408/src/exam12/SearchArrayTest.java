package exam12;

class NotfoundException extends Exception {
	public NotfoundException(String msg) {
		super(msg);
	}
}

class SearchArray {
	public void search(int[] arr, int data) throws NotfoundException{
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				break;
			}
		}
		if (i == arr.length) {
			throw new NotfoundException("ã���� �ϴ�"+ data+"�� �迭�� �����ϴ�.");
		} else {
			System.out.println("ã���� �ϴ� " + data + "�� " + i + "��° �־��");

		}
		
	}
}
public class SearchArrayTest {
	
	public static void main(String[] args) {
		
		try {
			int []a = {10,20,30,40,50,60};
			SearchArray sa = new SearchArray();
			sa.search(a, 20);
			sa.search(a, 100);
			
		} catch (NotfoundException e) {
			System.out.println("���� �߻�: "+e.getMessage());
		}
		
		
	}
	
}
