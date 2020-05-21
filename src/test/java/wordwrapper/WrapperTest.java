package wordwrapper;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

public class WrapperTest {

    private void assertWraps(String s, int width, String expected) {
        assertThat(wrap(s, width)).isEqualTo(expected);
    }

    @Test
    public void should_wrap() {

        assertWraps(null, 1, "");
        assertWraps("", 1, "");
        assertWraps("x", 1, "x");
        assertWraps("xx", 1, "x\nx");
        assertWraps("xxx", 1, "x\nx\nx");
    }

    private String wrap(String s, int width) {
        if (s == null) {
            return "";
        }

        if (s.length() <= width) {
            return s;
        }

        return s.substring(0, width) + "\n" + wrap(s.substring(width), width);
    }
}
