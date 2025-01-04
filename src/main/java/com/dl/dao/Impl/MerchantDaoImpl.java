package com.dl.dao.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dl.dao.MerchantDao;
import com.dl.mapper.MerchantMapper;
import com.dl.pojo.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantDaoImpl extends ServiceImpl<MerchantMapper, Merchant> implements MerchantDao {
    @Autowired
    private MerchantMapper merchantMapper;

    public void test(String status){
        LambdaQueryWrapper<Merchant> wrapper = Wrappers.lambdaQuery(Merchant.class)
                .select(Merchant::getMerchantName)
                .eq(Merchant::getStatus, status);
        List<Merchant> merchants = merchantMapper.selectList(wrapper);

        LambdaUpdateWrapper<Merchant> updateWrapper = Wrappers.lambdaUpdate(Merchant.class)
                .set(Merchant::getMerchantName, "nb")
                .eq(Merchant::getStatus, "active");
        Merchant merchant = new Merchant();
        merchantMapper.update(merchant,updateWrapper);
    }
}
