package com.example.foo;

import com.ibm.websphere.management.AdminClient;
import com.ibm.websphere.management.AdminClientFactory;

import javax.management.ObjectName;
import java.util.Properties;
import com.example.foo.FooService;

public class FooImpl implements FooService {
    public String callMBean(String host, String port, String username, String password, String mbeanName, String operation, Object[] params, String[] signature) throws Exception {
        Properties props = new Properties();
        props.setProperty(AdminClient.CONNECTOR_TYPE, AdminClient.CONNECTOR_TYPE_SOAP);
        props.setProperty(AdminClient.CONNECTOR_HOST, host);
        props.setProperty(AdminClient.CONNECTOR_PORT, port);
        props.setProperty(AdminClient.USERNAME, username);
        props.setProperty(AdminClient.PASSWORD, password);
        AdminClient adminClient = AdminClientFactory.createAdminClient(props);
        ObjectName mbean = new ObjectName(mbeanName);
        Object result = adminClient.invoke(mbean, operation, params, signature);
        return result != null ? result.toString() : null;
    }
}
