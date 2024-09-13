package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TushuguanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TushuguanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TushuguanxinxiView;


/**
 * 图书馆信息
 *
 * @author 
 * @email 
 * @date 2021-02-01 19:13:06
 */
public interface TushuguanxinxiService extends IService<TushuguanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TushuguanxinxiVO> selectListVO(Wrapper<TushuguanxinxiEntity> wrapper);
   	
   	TushuguanxinxiVO selectVO(@Param("ew") Wrapper<TushuguanxinxiEntity> wrapper);
   	
   	List<TushuguanxinxiView> selectListView(Wrapper<TushuguanxinxiEntity> wrapper);
   	
   	TushuguanxinxiView selectView(@Param("ew") Wrapper<TushuguanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TushuguanxinxiEntity> wrapper);
   	
}

