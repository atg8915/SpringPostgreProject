package com.sist.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.sist.web.vo.RecipeVO;

@Mapper
@Repository
public interface RecipeMapper {
	@Select("SELECT * FROM recipe "
			+ "ORDER BY RCP_SEQ")
	public List<RecipeVO> recipeAllData();
}
