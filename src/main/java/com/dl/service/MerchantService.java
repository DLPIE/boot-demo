package com.dl.service;

import com.dl.pojo.Merchant;

import java.util.List;

public interface MerchantService {
    List<Merchant> query(String status);
}
