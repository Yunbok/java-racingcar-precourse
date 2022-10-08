package racingcar.domain;

import racingcar.random.RandomUtil;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> cars;

    public Cars() {
        cars= new ArrayList<>();
    }

    public Cars(final List<String> names) {
        this();
        for (String name : names) {
            cars.add(new Car(name));
        }
    }

    public int size() {
        return cars.size();
    }

    public int move(final List<Integer> randomNumbers) {
        int first = 0;
        for (int i = 0; i < this.size(); i++) {
            int number = randomNumbers.get(i);
            Car car = cars.get(i);
            first = Math.max(car.stopAndGo(number), first);
        }

        return first;
    }

    public List<Car> winners(final int mostMoveCount) {
        List<Car> winners = new ArrayList<>();

        for (Car car : cars) {
            compareWinner(mostMoveCount, winners, car);
        }
        return winners;
    }

    private void compareWinner(final int mostMoveCount, final List<Car> winners, final Car car) {
        if (car.getWinCount() == mostMoveCount) {
            winners.add(car);
        }
    }

    @Override
    public String toString() {
        return "Cars{" +
                "cars=" + cars +
                '}';
    }
}
