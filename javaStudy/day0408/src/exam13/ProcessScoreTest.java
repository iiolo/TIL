package exam13;



class IllegalScore extends Exception {
	public IllegalScore(String msg) {
		super(msg);
	}
}
class ProcessScore {
	double avg;
	public ProcessScore(int []score) throws IllegalAccessError{
		
		int sum = 0;
		for (int i = 0; i < score.length; i++) {

			if (score[i]>=0) {
				sum += score[i];
			} else {
				throw new IllegalAccessError("성적이 음수일 수는 없습니다.");
			}
			
			
		}
		avg = (double)sum / score.length;
	}
	
	public double getAvg() {
		return avg;
	}
}

	
public class ProcessScoreTest {

	public static void main(String[] args) {
		try {
			int a[] = {90,80,100,80,90,70};
			ProcessScore ps = new ProcessScore(a);
			System.out.println("평균: "+ps.getAvg());
		} catch (IllegalAccessError e) {
			System.out.println("예외 발생: "+e.getMessage());
		}

	}

}
