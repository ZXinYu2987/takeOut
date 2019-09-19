package com.mr.takediscountcoupon.service.impl;

import com.mr.takediscountcoupon.mapper.DisMapper;
import com.mr.takediscountcoupon.service.DisService;
import com.mr.takedomain.common.DataGridVO;
import com.mr.takedomain.domain.Discount;
import com.mr.takedomain.domain.Store;
import com.mr.takedomain.domain.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DisServiceImpl implements DisService {
    @Autowired
    private DisMapper disMapper;

    @Override
    public DataGridVO queryCoupon(UserVO userVO, Store store) {
        Map<String,Object> map=new HashMap<>();
        map.put("userVO",userVO.getUserId());
        map.put("store",store.getSid());
        List<Discount> list=disMapper.queryCoupon(map);
        int total=disMapper.queryTotal(map);
        DataGridVO dg=new DataGridVO();
        dg.setRows(list);
        dg.setTotal(total);
        return dg;
    }
}
