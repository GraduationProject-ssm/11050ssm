package com.dao;

import com.entity.TushuguanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TushuguanxinxiVO;
import com.entity.view.TushuguanxinxiView;


/**
 * 图书馆信息
 * 
 * @author 
 * @email 
 * @date 2021-02-01 19:13:06
 */
public interface TushuguanxinxiDao extends BaseMapper<TushuguanxinxiEntity> {
	
	List<TushuguanxinxiVO> selectListVO(@Param("ew") Wrapper<TushuguanxinxiEntity> wrapper);
	
	TushuguanxinxiVO selectVO(@Param("ew") Wrapper<TushuguanxinxiEntity> wrapper);
	
	List<TushuguanxinxiView> selectListView(@Param("ew") Wrapper<TushuguanxinxiEntity> wrapper);

	List<TushuguanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TushuguanxinxiEntity> wrapper);
	
	TushuguanxinxiView selectView(@Param("ew") Wrapper<TushuguanxinxiEntity> wrapper);
	
}
