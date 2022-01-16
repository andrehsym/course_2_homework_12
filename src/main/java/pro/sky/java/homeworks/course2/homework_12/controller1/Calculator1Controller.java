package pro.sky.java.homeworks.course2.homework_12.controller1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class Calculator1Controller {

    private final Calculator1Service calculator1Service;

    public Calculator1Controller(Calculator1Service calculator1Service) {
        this.calculator1Service = calculator1Service;
    }

    @GetMapping
    public String welcomeCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus1(@RequestParam (required = true) int num1, @RequestParam (required = true) int num2) {
        return num1 + " + " + num2 + " = " + calculator1Service.plusInt(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam (required = true) int num1, @RequestParam (required = true) int num2) {
        return num1 + " - " + num2 + " = " + calculator1Service.minusInt(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam (required = true) int num1, @RequestParam (required = true) int num2) {
        return num1 + " * " + num2 + " = " + calculator1Service.multiplyInt(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam (required = true) int num1, @RequestParam (required = true) int num2) {
        if (num2 == 0) {
            return "Делить на 0 нельзя";
        } else return num1 + " / " + num2 + " = " + calculator1Service.divideInt(num1, num2);
    }
}
