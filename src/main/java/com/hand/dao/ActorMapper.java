package com.hand.dao;

import com.hand.entity.Actor;
import com.hand.entity.ActorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActorMapper {
    int countByExample(ActorExample example);

    int deleteByExample(ActorExample example);

    int deleteByPrimaryKey(Short actorId);

    int insert(Actor record);

    int insertSelective(Actor record);

    List<Actor> selectByExample(ActorExample example);

    Actor selectByPrimaryKey(Short actorId);

    int updateByExampleSelective(@Param("record") Actor record, @Param("example") ActorExample example);

    int updateByExample(@Param("record") Actor record, @Param("example") ActorExample example);

    int updateByPrimaryKeySelective(Actor record);

    int updateByPrimaryKey(Actor record);
}