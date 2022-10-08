package racingcar.valitate;

import java.util.ArrayList;
import java.util.List;

public class ValidationUtil {

    public static Integer numberValidation(final String input) throws IllegalArgumentException {
        try {
            return Integer.valueOf(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자를 입력해 주세요.");
        }
    }

    public static List<String> nameValidation(final String names) {
        return createNameList(nameCommaSplit(names));
    }

    private static String[] nameCommaSplit(final String names) {
        return names.split(",");
    }

    private static List<String> createNameList(final String[] names) {
        List<String> nameList = new ArrayList<>();
        for (String name : names) {
            addNameList(nameList, name);
        }
        return nameList;
    }

    private static void addNameList(List<String> nameList, String name) {
        if (!name.isEmpty()) {
            nameList.add(name.trim());
        }
    }

    public static Integer checkNumber(String inputNumber) {
        try {
            return Integer.valueOf(inputNumber);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }
}
