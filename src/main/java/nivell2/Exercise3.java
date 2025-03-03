package nivell2;

import org.assertj.core.api.Assertions;

public class Exercise3 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};

        Assertions.assertThat(array1).isEqualTo(array2);
    }
}
