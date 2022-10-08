package racingcar.random;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomUtil {

    private RandomUtil() {
    }

    public static int randomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }

    public static List<Integer> randomNumbers(int size) {
        List<Integer> randomNumbers = new ArrayList<>();


        for (int i = 0; i < size; i++) {
            randomNumbers.add(Randoms.pickNumberInRange(0, 9));
        }
        return randomNumbers;
    }
}
