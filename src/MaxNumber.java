public class MaxNumber {

    public static void Art(int A, int B, int C) {

        if (A>B) {
            System.out.println(A);
        } else {
            System.out.println(B);
        }
        if (A>C){
            System.out.println(A);
        } else {
            System.out.println(C);
        }
    }
    public static void main(String[] args) {
        MaxNumber.Art(10,5,2);
    }
}