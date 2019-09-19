package com.mr.takediscountcoupon.controller;

import com.mr.takediscountcoupon.service.DisService;
import com.mr.takedomain.common.DataGridVO;
import com.mr.takedomain.domain.Store;
import com.mr.takedomain.domain.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisController {

    @Autowired
    private DisService disService;


    @RequestMapping("queryCoupon")
    public DataGridVO queryCoupon(UserVO userVO, Store store){
        DataGridVO dg=disService.queryCoupon(userVO,store);
        return dg;
    }
}
