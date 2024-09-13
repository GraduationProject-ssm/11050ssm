package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TushuguanxinxiDao;
import com.entity.TushuguanxinxiEntity;
import com.service.TushuguanxinxiService;
import com.entity.vo.TushuguanxinxiVO;
import com.entity.view.TushuguanxinxiView;

@Service("tushuguanxinxiService")
public class TushuguanxinxiServiceImpl extends ServiceImpl<TushuguanxinxiDao, TushuguanxinxiEntity> implements TushuguanxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TushuguanxinxiEntity> page = this.selectPage(
                new Query<TushuguanxinxiEntity>(params).getPage(),
                new EntityWrapper<TushuguanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TushuguanxinxiEntity> wrapper) {
		  Page<TushuguanxinxiView> page =new Query<TushuguanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TushuguanxinxiVO> selectListVO(Wrapper<TushuguanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TushuguanxinxiVO selectVO(Wrapper<TushuguanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TushuguanxinxiView> selectListView(Wrapper<TushuguanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TushuguanxinxiView selectView(Wrapper<TushuguanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
