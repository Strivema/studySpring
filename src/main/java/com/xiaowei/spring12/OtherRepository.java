package com.xiaowei.spring12;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * @athour Marie
 * @date 2018/12/3 7:36 PM
 **/
public interface OtherRepository extends MongoRepository<Other, String> {
    List<Other> findByName(String c);

    List<Other> findByNameLike(String c);

    @Query("'type':0")
    List<Other> findByType(String c);

}
