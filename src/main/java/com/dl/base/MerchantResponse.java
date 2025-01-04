package com.dl.base;

import com.dl.pojo.Merchant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MerchantResponse {
    List<Merchant> merchants;
}
