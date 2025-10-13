package com.example.service.config;

import java.util.HashMap;
import java.util.Map;

public class CustomConfigSource2 extends CustomConfigSource1 {

	

	public CustomConfigSource2(String metadata) {
		super(null, metadata);
	}

	@Override
	public String getName() {
		return getClass().getSimpleName();
	}

	public Map<String, String> getProperties() {
		System.out.println("getproperties called:"+getName() + " " + getOrdinal());
		Map<String, String> retval = new HashMap<>();
		retval.put("testval", getName());
		System.out.println(getName() + " returning "+retval);
		return retval;
	}
	
	protected boolean isEnabled() {
		return  (getName().equals(System.getProperty("configenabled")));
	}

}
