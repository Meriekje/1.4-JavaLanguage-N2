package nivell2;

import org.assertj.core.api.Assertions;

public class Exercise2 {

    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = str1;

        Assertions.assertThat(str1).isSameAs(str2);

        String str3 = new String("Hello");
        Assertions.assertThat(str1).isNotSameAs(str3);
    }
}
