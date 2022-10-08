package racingcar.utils;

import static racingcar.constant.ErrorMessages.*;
import static racingcar.constant.GameConfig.NAME_LENGTH;
import static racingcar.constant.GameConfig.NAME_SEPARATOR;

public class ValidationUtils {

    public static String[] nameValidation(String names) {
        nameNullCheck(names);
        String[] splitName = nameSplit(names);
        namesCheck(splitName);
        return splitName;
    }

    public static Integer roundValidation(String round) {
        roundNullCheck(round);
        Integer roundNumber = integerRound(round);
        checkGreaterThanZero(roundNumber);
        return roundNumber;
    }

    private static void checkGreaterThanZero(Integer number) {
        if (number <= 0) {
            throw new IllegalArgumentException(ROUND_LESS_THEN_ZERO);
        }
    }

    private static Integer integerRound(String round) {
        try {
            return Integer.valueOf(round);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ROUND_NOT_NUMBER);
        }
    }

    private static void roundNullCheck(String round) {
        if (round.isEmpty()) {
            throw new IllegalArgumentException(ROUND_NOT_INPUT);
        }
    }

    private static void nameNullCheck(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException(NAME_NOT_INPUT);
        }
    }

    private static void namesCheck(String[] names) {
        for (String name : names) {
            nameLengthCheck(name, NAME_LENGTH);
        }
    }

    private static void nameLengthCheck(String name, int size) {
        if (name.length() < 1 || name.length() >  size){
            throw new IllegalArgumentException(NAME_LENGTH_EXCEEDED);
        }
    }

    private static String[] nameSplit(String names) {
        return names.split(NAME_SEPARATOR);
    }

}
