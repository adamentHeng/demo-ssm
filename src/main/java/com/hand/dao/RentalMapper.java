package com.hand.dao;

import com.hand.entity.Rental;
import com.hand.entity.RentalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RentalMapper {
    int countByExample(RentalExample example);

    int deleteByExample(RentalExample example);

    int deleteByPrimaryKey(Integer rentalId);

    int insert(Rental record);

    int insertSelective(Rental record);

    List<Rental> selectByExample(RentalExample example);

    Rental selectByPrimaryKey(Integer rentalId);

    int updateByExampleSelective(@Param("record") Rental record, @Param("example") RentalExample example);

    int updateByExample(@Param("record") Rental record, @Param("example") RentalExample example);

    int updateByPrimaryKeySelective(Rental record);

    int updateByPrimaryKey(Rental record);
}