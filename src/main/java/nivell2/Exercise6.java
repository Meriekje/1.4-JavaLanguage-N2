package nivell2;

import org.assertj.core.api.Assertions;

public class Exercise6 {
    public static void main(String[] args) {
        int[] array = new int[3];

        try {
            int value = array[5];
            Assertions.fail("ArrayIndexOutOfBoundsException have been thrown.");
        } catch (ArrayIndexOutOfBoundsException e) {
            Assertions.assertThat(e).isInstanceOf(ArrayIndexOutOfBoundsException.class);
        }
    }

}
