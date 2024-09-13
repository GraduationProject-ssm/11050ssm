package com.entity.vo;

import com.entity.TushuguihaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 图书归还
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-01 19:13:06
 */
public class TushuguihaiVO  implements Serializable {
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
	 * 可借天数
	 */
	
	private String kejietianshu;
		
	/**
	 * 图书馆名称
	 */
	
	private String tushuguanmingcheng;
		
	/**
	 * 借阅日期
	 */
	
	private String jieyueriqi;
		
	/**
	 * 归还日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date guihairiqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
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
	 * 设置：可借天数
	 */
	 
	public void setKejietianshu(String kejietianshu) {
		this.kejietianshu = kejietianshu;
	}
	
	/**
	 * 获取：可借天数
	 */
	public String getKejietianshu() {
		return kejietianshu;
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
	 * 设置：归还日期
	 */
	 
	public void setGuihairiqi(Date guihairiqi) {
		this.guihairiqi = guihairiqi;
	}
	
	/**
	 * 获取：归还日期
	 */
	public Date getGuihairiqi() {
		return guihairiqi;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
