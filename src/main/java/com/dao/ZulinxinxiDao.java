package com.dao;

import com.entity.ZulinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZulinxinxiVO;
import com.entity.view.ZulinxinxiView;


/**
 * 租赁信息
 * 
 * @author 
 * @email 
 * @date 2023-05-10 16:54:50
 */
public interface ZulinxinxiDao extends BaseMapper<ZulinxinxiEntity> {
	
	List<ZulinxinxiVO> selectListVO(@Param("ew") Wrapper<ZulinxinxiEntity> wrapper);
	
	ZulinxinxiVO selectVO(@Param("ew") Wrapper<ZulinxinxiEntity> wrapper);
	
	List<ZulinxinxiView> selectListView(@Param("ew") Wrapper<ZulinxinxiEntity> wrapper);

	List<ZulinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZulinxinxiEntity> wrapper);
	
	ZulinxinxiView selectView(@Param("ew") Wrapper<ZulinxinxiEntity> wrapper);
	

}
