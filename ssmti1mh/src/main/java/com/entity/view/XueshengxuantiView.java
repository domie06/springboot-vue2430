package com.entity.view;

import com.entity.XueshengxuantiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生选题
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-12 11:20:06
 */
@TableName("xueshengxuanti")
public class XueshengxuantiView  extends XueshengxuantiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengxuantiView(){
	}
 
 	public XueshengxuantiView(XueshengxuantiEntity xueshengxuantiEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengxuantiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
