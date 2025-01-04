package com.dl.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.dl.dao.MerchantDao;
import com.dl.pojo.Merchant;
import com.dl.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantServiceImpl implements MerchantService {
    @Autowired
    private MerchantDao merchantDao; // 声明为接口即可
    @Override
    public List<Merchant> query(String status){
        LambdaQueryWrapper<Merchant> wrapper = Wrappers.lambdaQuery(Merchant.class)
                .select(Merchant::getMerchantName)
                .eq(Merchant::getStatus, status);
        List<Merchant> merchants = merchantDao.list(wrapper);
//        List<Merchant> merchants = merchantDao.lambdaQuery()
//                .eq(Merchant::getStatus, status).list();
        return merchants;
    }
}
