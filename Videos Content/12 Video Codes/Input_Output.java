import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args) {

        Scanner scn =  new Scanner(System.in);

        double[] dbl_arr = new double[10];
        int l = dbl_arr.length;

        for (int i=0; i<l; i++) {
            dbl_arr[i] = scn.nextDouble();
        }

        for (int i=0; i<l; i++) {
            System.out.println("Value at " + (i+1) + " is" + dbl_arr[i]);
        }




    }
}
