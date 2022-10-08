package racingcar.domain;

import racingcar.utils.RandomUtils;

public class Race {

    Cars cars;
    int round;

    public Race(final Cars cars,final int round) {
        this.cars = cars;
        this.round = round;
    }

    public void start() {
        cars.move(RandomUtils.randomNumbers(cars.size()));
    }



}
