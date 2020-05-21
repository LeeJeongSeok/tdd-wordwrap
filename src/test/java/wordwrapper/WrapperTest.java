package wordwrapper;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WrapperTest {

    @Test
    public void should_wrap() {
        assertThat(wrap("word word", 4)).isEqualTo("word\nword");
    }

}
