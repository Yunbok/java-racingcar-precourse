package racingcar.domain;

import static racingcar.constant.GameConfig.CAR_MOVE_STRING;

public class Car {

    private final String name;
    private int winCount;

    public Car(final String name) {
        this.name = name;

    }

    public String move(final int randomNumber) {
        stopAndGo(randomNumber);
        StringBuilder moveStr = new StringBuilder(name + ": ");
        for (int i = 0; i < winCount; i++) {
            moveStr.append(CAR_MOVE_STRING);
        }
        return moveStr.toString();
    }

    public void stopAndGo(final int randomNumber) {
        if (randomNumber >= 4) {
            winCount++;
        }
    }
}
