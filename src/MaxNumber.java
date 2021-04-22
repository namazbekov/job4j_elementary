public class MaxNumber {

    public static void main(String[] args) {
        MaxNumber.Args(10,2,5);
    }

    public static void Args(int A, int B, int C) {
        if (A > B) {
            if (A > C)
                System.out.println(A);
        } else {
            System.out.println(B);
        }
    }

}