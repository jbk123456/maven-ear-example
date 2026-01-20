package com.example.foo;

public interface FooService {
    String callMBean(String host, String port, String username, String password, String mbeanName, String operation, Object[] params, String[] signature) throws Exception;
}
