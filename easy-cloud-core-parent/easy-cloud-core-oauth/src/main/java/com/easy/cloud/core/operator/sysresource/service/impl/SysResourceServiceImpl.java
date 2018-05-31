package com.easy.cloud.core.operator.sysresource.service.impl;

import org.springframework.stereotype.Service;

import com.easy.cloud.core.basic.pojo.dto.EcBaseServiceResult;
import com.easy.cloud.core.basic.service.EcBaseService;
import com.easy.cloud.core.common.collections.utils.EcCollectionsUtils;
import com.easy.cloud.core.common.json.utils.EcJSONUtils;
import com.easy.cloud.core.common.log.annotation.EcLogAnnotation;
import com.easy.cloud.core.operator.sysresource.dao.SysResourceDAO;
import com.easy.cloud.core.operator.sysresource.pojo.dto.SysResourceDTO;
import com.easy.cloud.core.operator.sysresource.pojo.entity.SysResourceEntity;
import com.easy.cloud.core.operator.sysresource.pojo.query.SysResourceQuery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.easy.cloud.core.operator.sysresource.service.SysResourceService;

/**
 * 描述：服务实现类
 * 
 * @author THINK
 * @date 2018-05-30 16:24:17
 */
@Service(value = "sysResourceService")
@EcLogAnnotation(logSwitch = false, analysisSwitch = false)
public class SysResourceServiceImpl extends EcBaseService implements SysResourceService {
	/** null数据处理接口 */
	@Autowired
	private SysResourceDAO sysResourceDAO;
	
	public EcBaseServiceResult save(SysResourceDTO resourceDTO) {
		SysResourceEntity resourceEntity = EcJSONUtils.parseObject(resourceDTO, SysResourceEntity.class);
		sysResourceDAO.save(resourceEntity);
		return EcBaseServiceResult.newInstanceOfSucResult(resourceEntity);
	}
	
	public List<SysResourceEntity> findByRoleNos(List<Integer> roleNos) {
		if (EcCollectionsUtils.isEmpty(roleNos)) {
			return null;
		}
		SysResourceQuery query = new SysResourceQuery();
		query.setRoleNos(roleNos);
		return sysResourceDAO.listByQuery(query);
	}
		
}