package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Cars;
import racingcar.domain.Race;
import racingcar.valitate.ValidationUtil;
import racingcar.view.ConsoleInput;

import java.util.List;

public class RaceController {

    public void play() {
        List<String> names = inputNames();
        Integer totalRound = inputRound();
        Race race = null;
        Cars cars = new Cars(names);

        for (int i = 0; i < totalRound; i++) {
            race = new Race(cars, i);
            race.start();
        }

        System.out.println(race.roundWinnersName());
    }

    private Integer inputRound() {
        try {
            ConsoleInput.printMessage("시도할 횟수는 몇회인가요?");
            return inputNumber();
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] " + e.getMessage());
            return inputRound();
        }
    }

    private List<String> inputNames() {
        ConsoleInput.carNameInputMessage();
        return ValidationUtil.nameValidation(consoleInput());
    }

    public String consoleInput() {
        return Console.readLine();
    }

    public Integer inputNumber() {
        try {
            return Integer.valueOf(consoleInput());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자만 입력해주세요.");
        }
    }
}
