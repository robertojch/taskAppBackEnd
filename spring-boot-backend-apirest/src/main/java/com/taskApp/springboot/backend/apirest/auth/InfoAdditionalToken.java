package com.taskApp.springboot.backend.apirest.auth;

import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.taskApp.springboot.backend.apirest.models.entity.User;
import com.taskApp.springboot.backend.apirest.models.services.IUserService;

@Component
public class InfoAdditionalToken implements TokenEnhancer {

	@Autowired
	private IUserService userService;
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		
		User user = userService.findByUsername(authentication.getName());
		Map<String,Object> info = new HashMap<>();
		info.put("Additional info", authentication.getName());
		info.put("name_user",user.getId() + ":" + user.getUsername());
		
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		return accessToken;
	}
	
	

}
