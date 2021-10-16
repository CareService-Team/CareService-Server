package com.example.care.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.care.model.Thing;

@Mapper
public interface ThingMapper {
	
	@Select("SElECT * FROM thing WHERE t_id=#{t_id}")
	Thing getThing(@Param("t_id") String t_id);
	
	@Select("SELECT * FROM thing")
	List<Thing> getThingList();
	
	@Insert("INSERT INTO thing VALUES (#{t_id}, #{t_name}, #{t_remain})")
	int insertThing(@Param("t_id") String t_id, @Param("t_name") String t_name, @Param("t_remain") String t_remain);
	
	@Update("UPDATE thing SET s_remain=#{t_remain} WHERE t_id")
	int updateThing(@Param("t_id") String t_id, @Param("t_remain") String t_remain);
	
	@Delete("DELETE FROM thing WHERE t_id=#{t_id}")
	int deleteThing(@Param("t_id") String t_id);
}
