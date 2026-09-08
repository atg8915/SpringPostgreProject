package com.sist.web.mapper.oracle;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.sist.web.vo.RecipeVO;

@Mapper
@Repository
public interface OracleRecipeMapper {
	/*
	 * <select id="oraclerecipeAllData" resultType="com.sist.web.vo.RecipeVO">
	    SELECT *
	    FROM recipe
	    ORDER BY rcp_seq
	  </select>
	 */
	public List<RecipeVO> oracleRecipeAllData();
}
