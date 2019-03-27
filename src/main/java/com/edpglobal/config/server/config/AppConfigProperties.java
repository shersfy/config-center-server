package com.edpglobal.config.server.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="spring.profiles")
public class AppConfigProperties {

	private String[] active = {"jdbc"};
	
	@Value("${spring.cloud.config.server.git.uri}")
	private String gitUri;

	public String[] getActive() {
		return active;
	}

	public void setActive(String[] active) {
		this.active = active;
	}

	public String getGitUri() {
		return gitUri;
	}

	public void setGitUri(String gitUri) {
		this.gitUri = gitUri;
	}
	
}
