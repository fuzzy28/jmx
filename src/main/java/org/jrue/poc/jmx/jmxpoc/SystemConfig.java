package org.jrue.poc.jmx.jmxpoc;

public class SystemConfig implements SystemConfigMBean {

	private String serviceUrl = "http://defaultservice.org/service1";
	
	public String getServiceUrl() {
		return serviceUrl;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}
}
