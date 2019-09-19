package com.mr.takediscountcoupon.service;

import com.mr.takedomain.common.DataGridVO;
import com.mr.takedomain.domain.Store;
import com.mr.takedomain.domain.UserVO;

public interface DisService {
    DataGridVO queryCoupon(UserVO userVO, Store store);
}
