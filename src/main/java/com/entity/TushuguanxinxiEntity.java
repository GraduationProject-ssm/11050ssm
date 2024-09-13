package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 图书馆信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-01 19:13:06
 */
@TableName("tushuguanxinxi")
public class TushuguanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TushuguanxinxiEntity() {
		
	}
	
	public TushuguanxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 图书馆名称
	 */
					
	private String tushuguanmingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 建馆时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jianguanshijian;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 地址
	 */
					
	private String dizhi;
	
	/**
	 * 图书馆介绍
	 */
					
	private String tushuguanjieshao;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：图书馆名称
	 */
	public void setTushuguanmingcheng(String tushuguanmingcheng) {
		this.tushuguanmingcheng = tushuguanmingcheng;
	}
	/**
	 * 获取：图书馆名称
	 */
	public String getTushuguanmingcheng() {
		return tushuguanmingcheng;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：建馆时间
	 */
	public void setJianguanshijian(Date jianguanshijian) {
		this.jianguanshijian = jianguanshijian;
	}
	/**
	 * 获取：建馆时间
	 */
	public Date getJianguanshijian() {
		return jianguanshijian;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：地址
	 */
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
	/**
	 * 设置：图书馆介绍
	 */
	public void setTushuguanjieshao(String tushuguanjieshao) {
		this.tushuguanjieshao = tushuguanjieshao;
	}
	/**
	 * 获取：图书馆介绍
	 */
	public String getTushuguanjieshao() {
		return tushuguanjieshao;
	}

}
