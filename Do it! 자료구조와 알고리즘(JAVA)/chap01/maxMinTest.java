public class maxMinTest {
    public static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        return max;
    }

    public static int min3(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    public static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }
        return min;
    }
    
    public static void main(String[] args) {
        // max4 test
        System.out.println("max4(3,2,1,0) = "+max4(3, 2, 1, 0));
        System.out.println("max4(0,1,2,3) = "+max4(0,1,2,3));
        System.out.println("max4(1,2,3,0) = "+max4(1,2,3,0));
        System.out.println("max4(2,3,0,1) = "+max4(2,3,0,1));

        // min3 test
        System.out.println("min3(3,2,1) = "+min3(3, 2, 1));
        System.out.println("min3(1,2,3) = "+min3(1,2,3));
        System.out.println("min3(2,1,3) = "+min3(2,1,3));
        System.out.println("min3(2,3,1) = "+min3(2,3,1));
        

        // min4 test
        System.out.println("min4(3,2,1,0) = "+min4(3, 2, 1, 0));
        System.out.println("min4(0,1,2,3) = "+min4(0,1,2,3));
        System.out.println("min4(1,2,3,0) = "+min4(1,2,3,0));
        System.out.println("min4(2,3,0,1) = "+min4(2,3,0,1));
    }
}
