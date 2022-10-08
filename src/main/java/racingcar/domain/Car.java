package racingcar.domain;

import static racingcar.constant.GameConfig.START_MIN_VALUE;

public class Car {

    private final String name;
    private int winCount;

    public Car(String name) {
        this.name = name;
        winCount = 0;
    }
    public String go() {
        return "-";
    }

    public int stopAndGo(int randomNumber) {
        if (randomNumber >= START_MIN_VALUE) {
            winCount++;
        }
        return winCount;
    }

    public String getName() {
        return this.name;
    }

    public int getWinCount() {
        return winCount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", winCount=" + winCount +
                '}';
    }
}
