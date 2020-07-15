import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeratorGeneratorShould {
    @Test
    @DisplayName("Test for roman numerator generator")
    void generate_a_roman_numeral_for_a_given_decimal_number() {
        assertThat(RomanNumeratorGenerator.romanFor(1)).isEqualTo("I");
        assertThat(RomanNumeratorGenerator.romanFor(2)).isEqualTo("II");
        assertThat(RomanNumeratorGenerator.romanFor(3)).isEqualTo("III");
        assertThat(RomanNumeratorGenerator.romanFor(5)).isEqualTo("V");
        assertThat(RomanNumeratorGenerator.romanFor(6)).isEqualTo("VI");
        assertThat(RomanNumeratorGenerator.romanFor(7)).isEqualTo("VII");
        assertThat(RomanNumeratorGenerator.romanFor(10)).isEqualTo("X");
        assertThat(RomanNumeratorGenerator.romanFor(11)).isEqualTo("XI");
        assertThat(RomanNumeratorGenerator.romanFor(30)).isEqualTo("XXX");

    }
}
