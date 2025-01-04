package com.dl.controller;

import com.dl.base.MerchantRequest;
import com.dl.base.MerchantResponse;
import com.dl.pojo.Merchant;
import com.dl.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/merchant")
public class MerchantController {
    @Autowired // byType
    private MerchantService merchantService;
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public MerchantResponse queryUser(@RequestBody MerchantRequest request){
        List<Merchant> merchants = merchantService.query(request.getStatus());
        return new MerchantResponse(merchants);
    }

    // 测试git

}
