package nivell2;

import org.assertj.core.api.Assertions;

import java.util.HashMap;
import java.util.Map;

public class Exercise5 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");

        Assertions.assertThat(map).containsKey("key1");
    }
}
