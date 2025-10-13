package com.example.service.config;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.config.inject.ConfigProperty;


@ApplicationScoped
public class CustomConfigExample {

 
    @Inject
    @ConfigProperty(name = "app.allowed.users", defaultValue = "")
    private List<String> allowedUsers;

   
    @Inject
    @ConfigProperty(name = "app.server.hosts", defaultValue = "localhost")
    private List<String> serverHosts;

   
    @Inject
    @ConfigProperty(name = "app.enabled.features", defaultValue = "")
    private List<String> enabledFeatures;

    public List<String> getAllowedUsers() {
        return allowedUsers;
    }

    public List<String> getServerHosts() {
        return serverHosts;
    }

    public List<String> getEnabledFeatures() {
        return enabledFeatures;
    }

    public boolean isUserAllowed(String username) {
        return allowedUsers.contains(username);
    }

    public boolean isFeatureEnabled(String featureName) {
        return enabledFeatures.contains(featureName);
    }
}