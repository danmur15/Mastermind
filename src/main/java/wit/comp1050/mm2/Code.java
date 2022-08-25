package wit.comp1050.mm2;

import java.util.Random;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Code {

    public static int[] array = new int[4];
    public int guess = 0;



    public static int[] random() {
        Random rand = new Random();

        array[0] = rand.nextInt(6);
        array[1] = rand.nextInt(6);
        array[2] = rand.nextInt(6);
        array[3] = rand.nextInt(6);

        return array;
    }

    public static int inputCheck(int[] guess) {
        int i = 0;

        if (guess[0] == array[0]) {
            i++;
        }
        if (guess[1] == array[1]) {
            i++;
        }
        if (guess[2] == array[2]) {
            i++;
        }
        if (guess[3] == array[3]) {
            i++;
        }

        return i;
    }


}