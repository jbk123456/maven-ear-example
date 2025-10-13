package com.example.service.config;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.config.spi.ConfigSource;

import com.example.service.IParrotService;

public class CustomConfigSource1 implements ConfigSource, IConfigSourceMetadata {

	private String metadata;
	private Optional<IParrotService> service;

	public CustomConfigSource1(IParrotService service, String metadata) {
		this.metadata = metadata;
	}

	@Override
	public int getOrdinal() {
		return 50;
	}

	Optional<IParrotService> getService() {
    	if (service!=null) {
    		return service;
    	}
		try {
			service= Optional.of((IParrotService) new InitialContext().lookup("ejblocal:com.example.service.IAskMeAnythingService"));
			System.out.println("service erreichbar");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("PANIC: service is null");
		}
    	return Optional.empty();

	}
	@Override
	public Set<String> getPropertyNames() {
		return getProperties().keySet();
	}

	@Override
	public String getValue(String key) {
		return getProperties().get(key);
	}

	@Override
	public String getName() {
		return getClass().getSimpleName();
	}

	public Map<String, String> getProperties() {
		System.out.println("getproperties called:"+getName() + " " + getOrdinal());
		Map<String, String> retval = new HashMap<>();
		retval.put("testval", getService().map(s -> s.askMeAnything(getName())).orElse("service is null"));
		System.out.println(getName() + " returning "+retval);
		return retval;
	}

	@Override
	public String getMetadata() {
		return metadata;
	}
	
	protected boolean isEnabled() {
		return  (getName().equals(System.getProperty("configenabled")));
	}

}
