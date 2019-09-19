package com.mr.takemerchantconsummer.controller;

import com.mr.take_domain.domain.Merchant;
import com.mr.takemerchantconsummer.service.ConsummerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import java.util.Map;

@org.springframework.web.bind.annotation.RestController
public class RestController {

   @Autowired
   private ConsummerService merService;

    @RequestMapping("saveMerchant")
    public Map<String,Integer> saveMerchant(Merchant mer){
        int code=merService.saveMerchant(mer);
        Map<String,Integer> map=new HashMap<>();
        if(code==1){
            map.put("errorCode",1);
        }else{
            map.put("errorCode",2);
        }
        return map;
    }

}
