package exam01;

public class SistUtuil {
	
	//�ΰ��� ������ �Ű������� ���޹޾� �� �߿� ū���� ã�� ��ȯ�ϴ� �޼ҵ带 ����
	public int getMax(int a, int b) {
		int max;
		if(a>b) {
			max = a;
		}else {
			max = b;
		}
		return max;
	}
	
	//������ ������ �Ű������� ���޹޾� �� �߿� ū���� ã�� ��ȯ�ϴ� �޼ҵ带 ����
	public int getMax(int a, int b, int c) {
		int max;
		if(a>b) {
			if(a>c) {
				max = a;
			}else {
				max = c;
			}
		}else {
			if(b>c) {
				max = b;
			}else {
				max = c;
			}
		}
		return max;
	}
	
	//�ΰ��� �Ǽ��� ������ �Ű������� ���޹޾� �� �߿� ū���� ã�� ��ȯ�ϴ� �޼ҵ带 ����
	//�ϼ��ϸ� "3"
	public double getMax(double a, double b) {
		double max;
		if(a>b) {
			max = a;
		}else {
			max = b;
		}
		return max;
	}
	
	
	//������ �迭�� �Ű������� ���޹޾� �� �߿� ���� ū���� ã�� ��ȯ�ϴ� �޼ҵ带 ����
	//�޼ҵ� ���� ������ ��üȭ �� ���ϴ�.
	//�ϼ��ϸ� "1"
	public int getMax(int []data) {
		int max=data[0];
		for(int i=1; i<data.length; i++) {
			if(data[i]>max) {
				max = data[i];
			}
		}
		return max;
	}
	
}






















