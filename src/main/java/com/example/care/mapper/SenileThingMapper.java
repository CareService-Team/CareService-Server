package com.example.care.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.care.model.SenileThing;

@Mapper
public interface SenileThingMapper {

	@Select("SELECT * FROM senilething WHERE s_id=#{s_id}")
	SenileThing getSenileThing(@Param("s_id") String s_id);
	
	@Select("SELECT * FROM senilething")
	List<SenileThing> getSenileThingList();
	
	@Insert("INSERT INTO  senilething VALUES(#{s_address}, #{t_name}, #{t_count}, #{t_id}, #{s_id}, #{request_date})")
	int insertSenileThing(@Param("s_address") String s_address, 
			@Param("t_name") String t_name, 
			@Param("t_count") String t_count, 
			@Param("t_id") String t_id, 
			@Param("s_id") String s_id, 
			@Param("request_date") String request_date);
	
	@Update("UPDATE senilething SET t_count=#{t_count} WHERE s_address=#{s_address} AND request_date=#{request_date}")
	int updateSenileThing(@Param("s_address") String s_address,
			@Param("request_date") String request_date,
			@Param("t_count") String t_count);
	
	@Delete("DELETE FROM senilething WHERE s_address=#{s_address} AND request_date=#{request_date}")
	int deleteSenileThing(@Param("s_address") String s_address, @Param("request_date") String request_date);
}
