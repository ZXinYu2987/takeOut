package com.mr.takemerchantconsummer.service;

import com.mr.take_domain.domain.Merchant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("PROVIDER-HELLO")
public interface ConsummerService {

    @RequestMapping("/saveMerchant")
    int saveMerchant(@RequestBody Merchant mer);
}
