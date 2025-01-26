import java.util.ArrayList;
import java.util.List;

public class FlippingAnImage_832 {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0,0}, {1,0,0,1}, {0,1,1,1}, {1,0,1,0}};
        flipAndInvertImage(arr);
    }
    static public int[][] flipAndInvertImage(int[][] image) {
        for (int i=0; i<image.length; i++) {
             for (int k=0; k<image[i].length/2; k++) {
                 int temp = image[i][k];
                 image[i][k] = image[i][image[i].length-(k+1)];
                 image[i][image[i].length-(k+1)] = temp;
             }
            for (int j=0; j<image[i].length; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}
