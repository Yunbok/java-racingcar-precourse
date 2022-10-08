package racingcar.valitate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.*;
import static racingcar.valitate.ValidationUtil.numberValidation;

class ValidationUtilTest {

    @Test
    @DisplayName("IllegalArgumentException 발생 테스트")
    void numberValidationTest() {
        String number = "A";

        assertThatIllegalArgumentException()
                .isThrownBy(() -> numberValidation(number));
    }

    @Test
    @DisplayName("숫자 정상 변환 테스트")
    void numberValidationTest2() {
        String number = "1";

        assertThat(numberValidation(number)).isEqualTo(1);
    }

    @Test
    void nameValidation() {
        String names = "adfs,sdf,sdfd";

        assertThat(ValidationUtil.nameValidation(names)).contains("adfs", "sdf", "sdfd");
    }

}