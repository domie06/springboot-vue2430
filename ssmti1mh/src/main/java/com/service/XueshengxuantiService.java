package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengxuantiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengxuantiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengxuantiView;


/**
 * 学生选题
 *
 * @author 
 * @email 
 * @date 2021-05-12 11:20:06
 */
public interface XueshengxuantiService extends IService<XueshengxuantiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengxuantiVO> selectListVO(Wrapper<XueshengxuantiEntity> wrapper);
   	
   	XueshengxuantiVO selectVO(@Param("ew") Wrapper<XueshengxuantiEntity> wrapper);
   	
   	List<XueshengxuantiView> selectListView(Wrapper<XueshengxuantiEntity> wrapper);
   	
   	XueshengxuantiView selectView(@Param("ew") Wrapper<XueshengxuantiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengxuantiEntity> wrapper);
   	
}

