package nivell2;
import org.assertj.core.api.Assertions;
import java.util.Optional;

public class Exercise7 {

    public static void main(String[] args) {

        Optional<String> optional = Optional.empty();

        Assertions.assertThat(optional).isEmpty();
    }
}
