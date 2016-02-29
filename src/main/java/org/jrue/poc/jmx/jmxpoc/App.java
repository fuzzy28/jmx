package org.jrue.poc.jmx.jmxpoc;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Logger logger = new AppLogger();
        
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        SystemConfig systemConfig = new SystemConfig();
        mBeanServer.registerMBean(systemConfig, new ObjectName("org.jrue.poc.jmx.jmxpoc:type=SystemConfig"));
        while(true) {
        	logger.print(systemConfig.getServiceUrl());
        	Thread.sleep(3000);
        }
    }
}
