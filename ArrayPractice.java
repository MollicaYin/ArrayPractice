import java.util.ArrayList;


public class ArrayPractice {
public static int[] toPower(int size, int power) {
    int[] result = new int[size];
    for (int i = 0; i < size; i++) {
        result[i] = (int) Math.pow(i, power);
    }
    return result;
}
