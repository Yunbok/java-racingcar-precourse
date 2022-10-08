package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;

import static racingcar.utils.ValidationUtils.nameValidation;
import static racingcar.utils.ValidationUtils.roundValidation;
import static racingcar.view.ConsoleInput.printNameInputMessage;
import static racingcar.view.ConsoleInput.printRoundInputMessage;

public class RacingController {

    public void start() {
        printNameInputMessage();
        nameInput();
        printRoundInputMessage();
        roundInput();
    }

    public String[] nameInput() {
        return nameValidation(Console.readLine());
    }

    public Integer roundInput() {
        return roundValidation(Console.readLine());
    }


}
