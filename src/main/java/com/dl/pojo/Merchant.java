package com.dl.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@TableName("merchant") // 指定表名
public class Merchant {

    @TableId(value = "id", type = IdType.AUTO) // 指定主键字段和生成策略
    private Integer id;
    @TableField("merchant_name") // 如果配置文件开启了驼峰映射，这个注解就没必要了
    private String merchantName; // 商户名称

    private String contactName; // 联系人姓名

    private String contactEmail; // 联系人邮箱

    private String phoneNumber; // 电话号码

    private String address; // 地址

    private String status; // 状态
}
