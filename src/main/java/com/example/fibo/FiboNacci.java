package com.example.fibo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FiboNacci {
    static int num1,num2,num3,num4,num5,num6,num7,num8;
    @RequestMapping("/fibb")
    public String showNum( @RequestParam("num") int num1)
    {

        String output ="";
        num2=num1+1;
        num3=num2+1;
        num4=num3+1;
        num5=num4+num3+num2+num1;
        num6=num5+num4+num3+num2;
        num7=num6+num5+num4+num3;
        num8=num7+num6+num5+num4;

        output = output + " " + num1 +" " +num2 + " " + num3 + " "  + num4 + " " + num5 + " " + num6 + " " + num7 + " " + num8;
        return output;
    }
}
