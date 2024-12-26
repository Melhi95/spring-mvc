package service;

import dao.CarDao;
import dao.CarDaoImp;
import model.Car;

import java.util.List;

public class CarServiceImp implements CarService {

    CarDao carDao = new CarDaoImp();

    public List<Car> getCars() {
        return carDao.getCars();
    }

    public List<Car> getCarCount(Integer count) {
        return carDao.getCarCount(count);
    }
}
