import java.util.Scanner; // 키보드로 값을 입력받기 위한 패키지

class Max3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 최대값을 구합니다.");
        System.out.print("a의 값: ");
        int a = stdIn.nextInt(); // 키보드로 입력한 값 중 정수값 읽음
        System.out.print("b의 값: ");
        int b = stdIn.nextInt();
        System.out.print("c의 값: ");
        int c = stdIn.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c>max) {
            max = c;
        }

        System.out.println("최대값은 " + max + "입니다.");

    }


} 
