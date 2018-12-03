package com.xiaowei.spring12;

import lombok.Data;
import lombok.ToString;

/**
 * @athour Marie
 * @date 2018/12/3 7:03 PM
 **/
@Data
@ToString
public class Item {
    private int id;
    private Other other;
    private String product;
    private double price;
    private int quantity;

}
