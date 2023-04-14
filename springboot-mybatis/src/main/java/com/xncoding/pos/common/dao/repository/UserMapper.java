package com.xncoding.pos.common.dao.repository;

import com.xncoding.pos.common.dao.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.io.Serializable;
import java.util.List;

/**
 * 后台管理用户表 Mapper
 *
 * @author 熊能
 * @version 1.0
 * @since 2018/01/02
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> selectByName(@Param("username") String name);
}

