package com.xiaowei.assembly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @athour Marie
 * @date 2018/11/14 2:48 PM
 **/
@Component
@Cold
@Creamy
public class IceCream implements Dessert {
    @Autowired
    @Qualifier("cold")
    Dessert dessert;

    public IceCream(Dessert dessert) {
        this.dessert = dessert;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    public void type() {

    }

    public void price() {

    }
}
