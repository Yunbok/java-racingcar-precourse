package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;

import static racingcar.utils.ValidationUtils.nameValidation;
import static racingcar.view.ConsoleInput.printNameInputMessage;

public class RacingController {

    public void start() {
        printNameInputMessage();
        nameValidation(nameInput());
    }

    public String nameInput() {
        return Console.readLine();
    }
}
