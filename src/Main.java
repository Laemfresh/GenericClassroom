import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

    /*    System.out.println(Arrays.toString(abs(new int[]{1, 2, 3, 4, 5, 6})));
    }
    public static<V> V abs(V  anything ){
        return anything;*/

        Box<Integer> intBox = Box.createBox(42);
        Box<String> stringBox = Box.createBox("Fight Club");

        System.out.println("Integer Box Value: " + intBox.getValue());
        System.out.println("String Box Value: " + stringBox.getValue());

    }



}