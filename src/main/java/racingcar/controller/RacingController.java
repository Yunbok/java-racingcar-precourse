package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Cars;
import racingcar.domain.Race;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static racingcar.utils.ValidationUtils.nameValidation;
import static racingcar.utils.ValidationUtils.roundValidation;
import static racingcar.view.ConsoleInput.printNameInputMessage;
import static racingcar.view.ConsoleInput.printRoundInputMessage;
import static racingcar.view.ConsoleOutput.printMessage;

public class RacingController {

    public void start() {
        Map<Integer, Race> allRace = new HashMap<>();
        printNameInputMessage();
        String[] names = nameInput();
        printRoundInputMessage();
        int round = roundInput();
        Cars cars = new Cars(Arrays.asList(names));
        for (int i = 0; i < round; i++) {
            Race race = new Race(cars, i);
            race.start();
            allRace.put(round, race);
        }

        printMessage("최종 우승자 : " + allRace.get(round).roundWinnersName());
    }

    public String[] nameInput() {
        return nameValidation(Console.readLine());
    }

    public Integer roundInput() {
        return roundValidation(Console.readLine());
    }


}
