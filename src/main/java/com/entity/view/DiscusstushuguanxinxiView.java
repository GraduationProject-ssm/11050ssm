package com.entity.view;

import com.entity.DiscusstushuguanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 图书馆信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-01 19:13:06
 */
@TableName("discusstushuguanxinxi")
public class DiscusstushuguanxinxiView  extends DiscusstushuguanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusstushuguanxinxiView(){
	}
 
 	public DiscusstushuguanxinxiView(DiscusstushuguanxinxiEntity discusstushuguanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusstushuguanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
