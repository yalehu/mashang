package com.mashang.mastercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mashang.common.vo.Result;
import com.mashang.mastercontrol.service.MasterControlService;

@Controller
@RequestMapping("/masterControl")
public class MasterControlController {

	@Autowired
	private MasterControlService service;
	
	@GetMapping("/getSystemSetting")
	@ResponseBody
	public Result getSystemSetting() {
		return Result.success().setData(service.getSystemSetting());
	}

}
