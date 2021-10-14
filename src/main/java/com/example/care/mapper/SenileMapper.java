package com.example.care.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.care.model.Senile;

@Mapper
public interface SenileMapper {
	
	@Select("SELECT * FROM senile WHERE s_id=#{s_id}")
	Senile getSenileProfile(@Param("s_id") String s_id);
	
	@Select("SELECT * FROM senile")
	List<Senile> getSenileProfileList();
	
	@Insert("INSERT INTO  senile VALUES(#{s_id}, #{s_password}, #{s_name}, #{s_phone}, #{s_gender}, #{s_address}, #{s_birth})")
	int insertSenileProfile(@Param("s_id") String s_id, @Param("s_password") String s_password, @Param("s_name") String s_name, @Param("s_phone") String s_phone, 
			@Param("s_gender") String s_gender, @Param("s_address") String s_address, @Param("s_birth") String s_birth);
	
	@Update("UPDATE senile SET s_name=#{s_name}, s_phone=#{s_phone}, s_address=#{s_address} WHERE s_id=#{s_id}")
	int updateSenileProfile(@Param("s_id") String s_id, @Param("s_name") String s_name, @Param("s_phone") String s_phone, @Param("s_address") String s_address);
	
	@Delete("DELETE FROM senile WHERE s_id=#{s_id}")
	int deleteSenileProfile(@Param("s_id") String s_id);
	
}

