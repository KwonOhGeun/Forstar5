public class Forstar5 {
    public static void main(String[] args) {
        //피라미드 별찍기
        //
        int i, j, k;
        for (i = 0; i <= 4; i++) {
            for (j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < (2 * i)+1 ; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
