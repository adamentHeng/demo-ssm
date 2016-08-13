package com.hand.dao;

import com.hand.entity.FilmText;
import com.hand.entity.FilmTextExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FilmTextMapper {
    int countByExample(FilmTextExample example);

    int deleteByExample(FilmTextExample example);

    int deleteByPrimaryKey(Short filmId);

    int insert(FilmText record);

    int insertSelective(FilmText record);

    List<FilmText> selectByExampleWithBLOBs(FilmTextExample example);

    List<FilmText> selectByExample(FilmTextExample example);

    FilmText selectByPrimaryKey(Short filmId);

    int updateByExampleSelective(@Param("record") FilmText record, @Param("example") FilmTextExample example);

    int updateByExampleWithBLOBs(@Param("record") FilmText record, @Param("example") FilmTextExample example);

    int updateByExample(@Param("record") FilmText record, @Param("example") FilmTextExample example);

    int updateByPrimaryKeySelective(FilmText record);

    int updateByPrimaryKeyWithBLOBs(FilmText record);

    int updateByPrimaryKey(FilmText record);
}