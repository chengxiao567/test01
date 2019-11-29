package com.example.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.example.dao.AdminDao;
import com.example.entry.Admin;

@Service
public class AdminService {
	@Resource
	private AdminDao adminDao;

	/**
	 * 检查登录
	 * @param id
	 * @return
	 */
	public Admin checkLogin(String id) {
		Admin admin = adminDao.loginCheck(id);
		return admin;
	}
}
