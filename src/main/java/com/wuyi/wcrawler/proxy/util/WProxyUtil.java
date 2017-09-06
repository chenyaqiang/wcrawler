package com.wuyi.wcrawler.proxy.util;

import com.wuyi.wcrawler.bean.Proxy;
import com.wuyi.wcrawler.dao.ProxyDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component(value = "wProxyUtil")
public class WProxyUtil {
	private static Log LOG = LogFactory.getLog(WProxyUtil.class);

	private static ProxyDao proxyDao;

	@Autowired
	public  void setProxyDao(ProxyDao proxyDao) {
		WProxyUtil.proxyDao = proxyDao;
	}

	public static void saveProxy(List<Proxy> proxies) {
		if(proxies.size() == 1) {
			proxyDao.insert(proxies.get(0));
		} else {
			proxyDao.insertAll(proxies);
		}
	}
	public static List<Proxy> fetchProxy(int limit) {
		return proxyDao.selectRand(limit);
	}

	public static int countProxy() {
		return proxyDao.count().intValue();
	}
}
