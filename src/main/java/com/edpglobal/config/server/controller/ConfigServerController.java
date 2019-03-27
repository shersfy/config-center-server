package com.edpglobal.config.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edpglobal.config.server.config.AppConfigProperties;
import com.gouuse.datahub.commons.beans.Result;

@RestController
@RequestMapping("/config/server")
public class ConfigServerController {
	
	@Autowired
	private AppConfigProperties config;

	@GetMapping("/profile")
	public Result getActiveProfile() {
		Result res = new Result();
		AppConfigProperties prop = new AppConfigProperties();
		prop.setActive(config.getActive());
		prop.setGitUri(config.getGitUri());
		res.setModel(prop);
		return res;
	}
}
