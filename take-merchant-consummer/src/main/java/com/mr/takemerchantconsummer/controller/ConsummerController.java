package com.mr.takemerchantconsummer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConsummerController {

    @RequestMapping("merchantFun")
    public String merchantFun(){
        return "merchant/saveMerchant";
    }
}
