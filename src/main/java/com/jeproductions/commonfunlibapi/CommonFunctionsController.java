package com.jeproductions.commonfunlibapi;

import com.jeproductions.commonfunlibapi.Lib.CommonFunctions;
import com.jeproductions.commonfunlibapi.Models.CommonFunctionsModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CommonFunctionsController {
    @GetMapping("/common-functions")
    public CommonFunctionsModel computeFunction(
            @RequestParam(value = "type") String type,
            @RequestParam(value = "input1") int input1,
            @RequestParam(value = "input2", required = false, defaultValue = "-1") int input2
    ) {
        Object result = null;
        switch (type) {
            case "isEven":
                result = CommonFunctions.isEven(input1);
                break;
            case "isOdd":
                result = CommonFunctions.isOdd(input1);
                break;
            case "factorial":
                result = CommonFunctions.factorial(input1);
                break;
            case "gcd":
                if (input2 != -1) {
                    result = CommonFunctions.gcd(input1, input2);
                }
                break;
            case "lcm":
                if (input2 != -1) {
                    result = CommonFunctions.lcm(input1, input2);
                }
                break;
            case "isPrime":
                result = CommonFunctions.isPrime(input1);
                break;
            case "swapVariableValue":
                result = "swapped";
                break;
            case "reverseString":
                result = CommonFunctions.reverseString(Integer.toString(input1));
                break;
            default:
                break;
        }

        return new CommonFunctionsModel((String) result);
    }
}
