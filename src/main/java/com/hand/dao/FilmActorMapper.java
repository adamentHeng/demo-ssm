package com.hand.dao;

import com.hand.entity.FilmActor;
import com.hand.entity.FilmActorExample;
import com.hand.entity.FilmActorKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FilmActorMapper {
    int countByExample(FilmActorExample example);

    int deleteByExample(FilmActorExample example);

    int deleteByPrimaryKey(FilmActorKey key);

    int insert(FilmActor record);

    int insertSelective(FilmActor record);

    List<FilmActor> selectByExample(FilmActorExample example);

    FilmActor selectByPrimaryKey(FilmActorKey key);

    int updateByExampleSelective(@Param("record") FilmActor record, @Param("example") FilmActorExample example);

    int updateByExample(@Param("record") FilmActor record, @Param("example") FilmActorExample example);

    int updateByPrimaryKeySelective(FilmActor record);

    int updateByPrimaryKey(FilmActor record);
}