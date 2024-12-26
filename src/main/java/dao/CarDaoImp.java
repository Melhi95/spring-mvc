package dao;

import model.Car;

import java.util.List;

public class CarDaoImp implements CarDao {

    public List<Car> getCars() {
        return List.of(
                new Car(1, "BMW", 2020),
                new Car(2, "Audi", 2019),
                new Car(3, "Mercedes", 2018),
                new Car(4, "Toyota", 2017),
                new Car(5, "Honda", 2016)
        );
    }

    public List<Car> getCarCount(Integer count) {
        return getCars().stream()
                .limit(count)
                .toList();
    }
}
