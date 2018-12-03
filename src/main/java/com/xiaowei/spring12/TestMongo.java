package com.xiaowei.spring12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;

/**
 * @athour Marie
 * @date 2018/12/3 7:24 PM
 **/
public class TestMongo {
    @Autowired
    MongoOperations mongo;
    public void exMongo(){
        long order = mongo.getCollection("order").count();
        Other other = new Other();
        // 创建
        mongo.save(other,"other");

        String id = "";
        // 查询
        mongo.findById(id,Other.class);
        // 删除
        mongo.remove(other);

    }

}
