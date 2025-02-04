package com.javaex.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class KakaoToken {
	
	private String token_type;
	private String access_token;
	private Integer expires_in;
	private String refresh_token;
	private Integer refresh_token_expires_in;
	private String scope;
	
	
	public KakaoToken() {
		super();
	}


	public KakaoToken(String token_type, String access_token, Integer expires_in, String refresh_token,
			Integer refresh_token_expires_in, String scope) {
		super();
		this.token_type = token_type;
		this.access_token = access_token;
		this.expires_in = expires_in;
		this.refresh_token = refresh_token;
		this.refresh_token_expires_in = refresh_token_expires_in;
		this.scope = scope;
	}


	public String getToken_type() {
		return token_type;
	}


	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}


	public String getAccess_token() {
		return access_token;
	}


	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}


	public Integer getExpires_in() {
		return expires_in;
	}


	public void setExpires_in(Integer expires_in) {
		this.expires_in = expires_in;
	}


	public String getRefresh_token() {
		return refresh_token;
	}


	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}


	public Integer getRefresh_token_expires_in() {
		return refresh_token_expires_in;
	}


	public void setRefresh_token_expires_in(Integer refresh_token_expires_in) {
		this.refresh_token_expires_in = refresh_token_expires_in;
	}


	public String getScope() {
		return scope;
	}


	public void setScope(String scope) {
		this.scope = scope;
	}


	@Override
	public String toString() {
		return "KakaoToken [token_type=" + token_type + ", access_token=" + access_token + ", expires_in=" + expires_in
				+ ", refresh_token=" + refresh_token + ", refresh_token_expires_in=" + refresh_token_expires_in
				+ ", scope=" + scope + "]";
	}
	
	
	
	
}
