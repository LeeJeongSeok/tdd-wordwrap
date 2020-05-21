package wordwrapper;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WrapperTest {

    private void assertWraps(String s, int width, String expected) {
        assertThat(wrap(s, width)).isEqualTo(expected);
    }

    @Test
    public void should_wrap() {

        assertWraps(null, 1, "");
        assertWraps("", 1, "");
        assertWraps("x", 1, "x");
        assertWraps("xxxxxx", 6, "xxxxxx");
        assertWraps("a dog", 5, "a dog");
    }

    private String wrap(String s, int width) {
        if (s == null) {
            return "";
        }
        return s;
    }
}
