package com.entity.vo;

import com.entity.JiaonafajinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 缴纳罚金
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-01 19:13:06
 */
public class JiaonafajinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图书编号
	 */
	
	private String tushubianhao;
		
	/**
	 * 图书名称
	 */
	
	private String tushumingcheng;
		
	/**
	 * 罚款说明
	 */
	
	private String fakuanshuoming;
		
	/**
	 * 罚款金额
	 */
	
	private Float fakuanjine;
		
	/**
	 * 罚款日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fakuanriqi;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：罚款说明
	 */
	 
	public void setFakuanshuoming(String fakuanshuoming) {
		this.fakuanshuoming = fakuanshuoming;
	}
	
	/**
	 * 获取：罚款说明
	 */
	public String getFakuanshuoming() {
		return fakuanshuoming;
	}
				
	
	/**
	 * 设置：罚款金额
	 */
	 
	public void setFakuanjine(Float fakuanjine) {
		this.fakuanjine = fakuanjine;
	}
	
	/**
	 * 获取：罚款金额
	 */
	public Float getFakuanjine() {
		return fakuanjine;
	}
				
	
	/**
	 * 设置：罚款日期
	 */
	 
	public void setFakuanriqi(Date fakuanriqi) {
		this.fakuanriqi = fakuanriqi;
	}
	
	/**
	 * 获取：罚款日期
	 */
	public Date getFakuanriqi() {
		return fakuanriqi;
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
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
