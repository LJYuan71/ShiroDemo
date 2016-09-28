package com.sojson.common.timer;

import java.sql.Timestamp;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.sojson.permission.service.RoleService;


/**
 * 定时任务恢复数据
 *
 */
@Component
public class ToTimer{
	
	@Resource
	RoleService roleService;
	@Scheduled(cron = "0/20 20 * * * ? ")
	public void run() {
		/**
		 * cron表达式基础格式： 秒 分 时 日 月 年 周 （以上为每年每月每日每时20分钟20秒支持一次）
		 * 调用存储过程，重新创建表，插入初始化数据。
		 */
		//roleService.initData();
		System.out.println(new Timestamp(System.currentTimeMillis())+"  定时调用存储过程!");
	}

	
	
	
	
	
	
}
