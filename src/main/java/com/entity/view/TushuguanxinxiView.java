package com.entity.view;

import com.entity.TushuguanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 图书馆信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-01 19:13:06
 */
@TableName("tushuguanxinxi")
public class TushuguanxinxiView  extends TushuguanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TushuguanxinxiView(){
	}
 
 	public TushuguanxinxiView(TushuguanxinxiEntity tushuguanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, tushuguanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
