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


import com.dao.DiscusstushuguanxinxiDao;
import com.entity.DiscusstushuguanxinxiEntity;
import com.service.DiscusstushuguanxinxiService;
import com.entity.vo.DiscusstushuguanxinxiVO;
import com.entity.view.DiscusstushuguanxinxiView;

@Service("discusstushuguanxinxiService")
public class DiscusstushuguanxinxiServiceImpl extends ServiceImpl<DiscusstushuguanxinxiDao, DiscusstushuguanxinxiEntity> implements DiscusstushuguanxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstushuguanxinxiEntity> page = this.selectPage(
                new Query<DiscusstushuguanxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusstushuguanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstushuguanxinxiEntity> wrapper) {
		  Page<DiscusstushuguanxinxiView> page =new Query<DiscusstushuguanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstushuguanxinxiVO> selectListVO(Wrapper<DiscusstushuguanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstushuguanxinxiVO selectVO(Wrapper<DiscusstushuguanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstushuguanxinxiView> selectListView(Wrapper<DiscusstushuguanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstushuguanxinxiView selectView(Wrapper<DiscusstushuguanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
