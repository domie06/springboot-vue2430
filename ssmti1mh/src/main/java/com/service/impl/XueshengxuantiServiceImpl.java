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


import com.dao.XueshengxuantiDao;
import com.entity.XueshengxuantiEntity;
import com.service.XueshengxuantiService;
import com.entity.vo.XueshengxuantiVO;
import com.entity.view.XueshengxuantiView;

@Service("xueshengxuantiService")
public class XueshengxuantiServiceImpl extends ServiceImpl<XueshengxuantiDao, XueshengxuantiEntity> implements XueshengxuantiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengxuantiEntity> page = this.selectPage(
                new Query<XueshengxuantiEntity>(params).getPage(),
                new EntityWrapper<XueshengxuantiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengxuantiEntity> wrapper) {
		  Page<XueshengxuantiView> page =new Query<XueshengxuantiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengxuantiVO> selectListVO(Wrapper<XueshengxuantiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengxuantiVO selectVO(Wrapper<XueshengxuantiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengxuantiView> selectListView(Wrapper<XueshengxuantiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengxuantiView selectView(Wrapper<XueshengxuantiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
