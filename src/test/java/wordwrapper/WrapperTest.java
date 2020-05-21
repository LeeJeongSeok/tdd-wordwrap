package wordwrapper;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WrapperTest {

    @Test
    public void should_wrap() {
        assertThat(wrap("word word", 4)).isEqualTo("word\nword");
        assertThat(wrap("a dog", 5)).isEqualTo("a dog");

    }

    private String wrap(String s, int length) {
        return s.replace(" ", "\n");
    }
}
