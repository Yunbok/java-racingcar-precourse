package racingcar.domain;

import racingcar.random.RandomUtil;

import java.util.ArrayList;
import java.util.List;

public class Race {

    Cars cars;
    int round;

    int mostMoveCount;


    public Race(Cars cars, int round) {
        this.cars = cars;
        this.round = round;
        this.mostMoveCount = 0;
    }


    public void start() {
        mostMoveCount = cars.move(RandomUtil.randomNumbers(cars.size()));
    }

    public String roundWinnersName() {
        List<Car> winners = roundWinners();
        List<String> winnersName = new ArrayList<>();
        for (Car car : winners) {
            winnersName.add(car.getName());
        }
        return String.join(",",winnersName);
    }
    public List<Car> roundWinners() {
        return cars.winners(mostMoveCount);
    }

    @Override
    public String toString() {
        return "Race{" +
                "cars=" + cars +
                ", round=" + round +
                '}';
    }
}
