package com.example.care.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.care.model.Welfareworker;


@Mapper
public interface WelfareworkerMapper {
	
	@Select("SELECT * FROM welfareworker WHERE w_id=#{s_id}")
	Welfareworker getWelfareworker(@Param("w_id") String w_id);
	
	@Select("SELECT * FROM welfareworker")
	List<Welfareworker> getWelfareworkerList();
	
	@Insert("INSERT INTO welfareworker VALUES(#{w_id}, #{w_password}, #{w_name}, #{w_phone}, #{w_gender}, #{w_birth})")
	int insertWelfareworker(@Param("w_id") String w_id, @Param("w_password") String w_password, @Param("w_name") String w_name, @Param("w_phone") String w_phone, 
			@Param("w_gender") String w_gender, @Param("w_birth") String w_birth);
	
	@Update("UPDATE welfareworker SET w_name=#{w_name}, w_phone=#{w_phone} WHERE w_id=#{w_id}")
	int updateWelfareworker(@Param("w_id") String w_id, @Param("w_name") String w_name, @Param("s_phone") String s_phone);
	
	@Delete("DELETE FROM welfareworker WHERE w_id=#{w_id}")
	int deleteWelfareworker(@Param("w_id") String w_id);
}
