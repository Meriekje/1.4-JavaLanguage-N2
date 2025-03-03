package nivell2;

import org.assertj.core.api.Assertions;

public class Exercise1 {

    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 10;


        Assertions.assertThat(a).isEqualTo(b);

        Assertions.assertThat(a).isNotEqualTo(20);
    }
}
