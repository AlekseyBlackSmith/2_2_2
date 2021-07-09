package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;


@Controller
public class CarController {
    private final CarDao carDao;

    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }


    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "0", required = false) Integer count, Model model) {

        model.addAttribute("cars", carDao.getCars(count));

        return "cars";
    }
}
