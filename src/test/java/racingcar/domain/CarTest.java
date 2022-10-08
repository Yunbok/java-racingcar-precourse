package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    Car car;

    @BeforeEach
    void carInit() {
        car = new Car("yb");
    }

    @Test
    @DisplayName("각 자동차는 이름을 부여 받을 수 있다.")
    void carName() {
        assertThat("yb").isEqualTo(car.getName());
    }

    @Test
    @DisplayName("자동차 전진 할 수 있다")
    void go() {
        assertThat("-").isEqualTo(car.go());
    }

    @Test
    void test() {
        ArrayList<Object> objects = new ArrayList<>();

        objects.add(null);
        objects.add(null);
        objects.add(null);

        System.out.println("objects = " + objects.size());
    }
}
