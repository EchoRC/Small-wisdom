package com.cn.echo.service;

import java.util.Map;

/**
 * user interface
 * @author echo
 *
 */

public interface UserService {

	public void regist(Map<String,Object> param);
	
	public void login(Map<String,Object> param);
}
