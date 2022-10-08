package racingcar.utils;

import static racingcar.constant.ErrorMessages.NAME_LENGTH_EXCEEDED;
import static racingcar.constant.ErrorMessages.NAME_NOT_INPUT;
import static racingcar.constant.GameConfig.NAME_LENGTH;

public class ValidationUtils {

    public static String[] nameValidation(String names) {
        nameNullCheck(names);
        String[] splitName = nameSplit(names);
        namesCheck(splitName);
        return splitName;
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
        return names.split(",");
    }

}
