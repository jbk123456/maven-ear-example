package com.example.service.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.config.spi.ConfigSource;
import org.eclipse.microprofile.config.spi.ConfigSourceProvider;

import com.example.service.IParrotService;
import com.example.service.IExampleService;

public class CustomConfigProvider  implements ConfigSourceProvider {
	  private static final String MICROPROFILE_CONFIG_REFRESH_RATE = "microprofile.config.refresh.rate";
	//@Inject 
	  IExampleService exampleService;  
	  IParrotService service;  

	
	@Override
	public Iterable<ConfigSource> getConfigSources(ClassLoader forClassLoader) {
        List<ConfigSource> configSources = new ArrayList<>();

        CustomConfigSource1 s1 = new CustomConfigSource1(null, "irgendwas1");
		CustomConfigSource2 s2 = new CustomConfigSource2("irgendwas2");
		FileSystemConfigSource s3 = new FileSystemConfigSource();
		
		System.setProperty(MICROPROFILE_CONFIG_REFRESH_RATE, System.getProperty(MICROPROFILE_CONFIG_REFRESH_RATE,"1000"));
		if (s1.isEnabled()) {
			System.out.println(s1.getName() + " is enabled");
			configSources.add(s1);
		}
		if (s2.isEnabled()) {
			System.out.println(s2.getName() + " is enabled");
			configSources.add(s2);
		}
		configSources.add(s3);
		return configSources;
	}

}
