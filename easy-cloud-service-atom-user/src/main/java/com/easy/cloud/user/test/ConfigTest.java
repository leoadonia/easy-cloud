package com.easy.cloud.user.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dq.easy.cloud.model.common.json.utils.DqJSONUtils;

@RestController
@RequestMapping("test")
public class ConfigTest {

	@Value(value="${from}")
	private String from;
	
	@RequestMapping("getFrom")
	public String getFrom(){
		Map<String, Object> retMap = new HashMap<>();
		retMap.put("from", from);
		return DqJSONUtils.parseObject(retMap, String.class);
	}
}
