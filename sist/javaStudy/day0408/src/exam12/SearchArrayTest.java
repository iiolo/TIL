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
			throw new NotfoundException("찾고자 하는"+ data+"가 배열에 없습니다.");
		} else {
			System.out.println("찾고자 하는 " + data + "는 " + i + "번째 있어요");

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
			System.out.println("예외 발생: "+e.getMessage());
		}
		
		
	}
	
}
