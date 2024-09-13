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
 * 图书续借
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-01 19:13:06
 */
@TableName("tushuxujie")
public class TushuxujieEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TushuxujieEntity() {
		
	}
	
	public TushuxujieEntity(T t) {
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
	 * 借阅单号
	 */
					
	private String jieyuedanhao;
	
	/**
	 * 图书编号
	 */
					
	private String tushubianhao;
	
	/**
	 * 图书名称
	 */
					
	private String tushumingcheng;
	
	/**
	 * 图书馆名称
	 */
					
	private String tushuguanmingcheng;
	
	/**
	 * 借阅日期
	 */
					
	private String jieyueriqi;
	
	/**
	 * 应还日期
	 */
					
	private String yinghairiqi;
	
	/**
	 * 续借天数
	 */
					
	private Integer xujietianshu;
	
	/**
	 * 续借日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date xujieriqi;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：借阅单号
	 */
	public void setJieyuedanhao(String jieyuedanhao) {
		this.jieyuedanhao = jieyuedanhao;
	}
	/**
	 * 获取：借阅单号
	 */
	public String getJieyuedanhao() {
		return jieyuedanhao;
	}
	/**
	 * 设置：图书编号
	 */
	public void setTushubianhao(String tushubianhao) {
		this.tushubianhao = tushubianhao;
	}
	/**
	 * 获取：图书编号
	 */
	public String getTushubianhao() {
		return tushubianhao;
	}
	/**
	 * 设置：图书名称
	 */
	public void setTushumingcheng(String tushumingcheng) {
		this.tushumingcheng = tushumingcheng;
	}
	/**
	 * 获取：图书名称
	 */
	public String getTushumingcheng() {
		return tushumingcheng;
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
	 * 设置：借阅日期
	 */
	public void setJieyueriqi(String jieyueriqi) {
		this.jieyueriqi = jieyueriqi;
	}
	/**
	 * 获取：借阅日期
	 */
	public String getJieyueriqi() {
		return jieyueriqi;
	}
	/**
	 * 设置：应还日期
	 */
	public void setYinghairiqi(String yinghairiqi) {
		this.yinghairiqi = yinghairiqi;
	}
	/**
	 * 获取：应还日期
	 */
	public String getYinghairiqi() {
		return yinghairiqi;
	}
	/**
	 * 设置：续借天数
	 */
	public void setXujietianshu(Integer xujietianshu) {
		this.xujietianshu = xujietianshu;
	}
	/**
	 * 获取：续借天数
	 */
	public Integer getXujietianshu() {
		return xujietianshu;
	}
	/**
	 * 设置：续借日期
	 */
	public void setXujieriqi(Date xujieriqi) {
		this.xujieriqi = xujieriqi;
	}
	/**
	 * 获取：续借日期
	 */
	public Date getXujieriqi() {
		return xujieriqi;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
