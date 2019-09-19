package com.mr.takediscountcoupon.mapper;

import com.mr.takedomain.domain.Discount;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DisMapper {
    List<Discount> queryCoupon(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);
}
