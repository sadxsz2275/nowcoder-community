package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    //@Param用于给参数写别名
    //如果只有一个参数，并且在<if>中使用，必须用该注解
    int selectDiscussPostRows(@Param("userId") int userId);
}
