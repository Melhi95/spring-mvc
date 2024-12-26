package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImp;

import java.util.List;

@Controller
public class CarController {

    CarService carService = new CarServiceImp();

    @GetMapping(value = "/cars")
    public String showCar(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        List<Car> cars;

        if(count == null) {
            cars = carService.getCars();
        } else {
            cars = carService.getCarCount(count);
        }

        model.addAttribute("cars", cars);
        return "cars";
    }
}
