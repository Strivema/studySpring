package com.xiaowei.spring12;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * @athour Marie
 * @date 2018/11/30 7:06 PM
 **/

@Document
@ToString
@Data
public class Other {
    @Id
    public String id;
    @Field("client")
    public String name;
    public String type;
    public String pass;
    private Collection<Item> items = new LinkedHashSet<Item>();


}
