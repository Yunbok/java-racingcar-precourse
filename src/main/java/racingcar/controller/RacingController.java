package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Cars;
import racingcar.domain.Race;

import java.util.Arrays;

import static racingcar.utils.ValidationUtils.nameValidation;
import static racingcar.utils.ValidationUtils.roundValidation;
import static racingcar.view.ConsoleInput.printNameInputMessage;
import static racingcar.view.ConsoleInput.printRoundInputMessage;

public class RacingController {

    public void start() {
        printNameInputMessage();
        String[] names = nameInput();
        printRoundInputMessage();
        int round = roundInput();

        Cars cars = new Cars(Arrays.asList(names));
        for (int i = 0; i < round; i++) {
            Race race = new Race(cars, round);
            race.start();
            System.out.println();
        }

    }

    public String[] nameInput() {
        return nameValidation(Console.readLine());
    }

    public Integer roundInput() {
        return roundValidation(Console.readLine());
    }


}
