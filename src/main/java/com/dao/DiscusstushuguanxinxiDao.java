package com.dao;

import com.entity.DiscusstushuguanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstushuguanxinxiVO;
import com.entity.view.DiscusstushuguanxinxiView;


/**
 * 图书馆信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-01 19:13:06
 */
public interface DiscusstushuguanxinxiDao extends BaseMapper<DiscusstushuguanxinxiEntity> {
	
	List<DiscusstushuguanxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusstushuguanxinxiEntity> wrapper);
	
	DiscusstushuguanxinxiVO selectVO(@Param("ew") Wrapper<DiscusstushuguanxinxiEntity> wrapper);
	
	List<DiscusstushuguanxinxiView> selectListView(@Param("ew") Wrapper<DiscusstushuguanxinxiEntity> wrapper);

	List<DiscusstushuguanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstushuguanxinxiEntity> wrapper);
	
	DiscusstushuguanxinxiView selectView(@Param("ew") Wrapper<DiscusstushuguanxinxiEntity> wrapper);
	
}
