package com.dao;

import com.entity.TushuxujieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TushuxujieVO;
import com.entity.view.TushuxujieView;


/**
 * 图书续借
 * 
 * @author 
 * @email 
 * @date 2021-02-01 19:13:06
 */
public interface TushuxujieDao extends BaseMapper<TushuxujieEntity> {
	
	List<TushuxujieVO> selectListVO(@Param("ew") Wrapper<TushuxujieEntity> wrapper);
	
	TushuxujieVO selectVO(@Param("ew") Wrapper<TushuxujieEntity> wrapper);
	
	List<TushuxujieView> selectListView(@Param("ew") Wrapper<TushuxujieEntity> wrapper);

	List<TushuxujieView> selectListView(Pagination page,@Param("ew") Wrapper<TushuxujieEntity> wrapper);
	
	TushuxujieView selectView(@Param("ew") Wrapper<TushuxujieEntity> wrapper);
	
}
