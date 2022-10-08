package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

import static racingcar.view.ConsoleOutput.printMessage;

public class Cars {

    List<Car> cars;

    public Cars() {
        cars = new ArrayList<>();
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
    public void move(List<Integer> randomNumbers) {
        int carSize = size();
        for (int i = 0; i < carSize; i++) {
            int number = randomNumbers.get(i);
            Car car = cars.get(i);
            printMessage(car.move(number));
        }
    }
}
