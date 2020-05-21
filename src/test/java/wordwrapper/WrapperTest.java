package wordwrapper;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WrapperTest {

    @Test
    public void should_wrap() {
        assertThat(wrap(null, 1)).isEqualTo("");
        assertThat(wrap("", 1)).isEqualTo("");

    }

    private String wrap(String s, int width) {
        return "";
    }
}
