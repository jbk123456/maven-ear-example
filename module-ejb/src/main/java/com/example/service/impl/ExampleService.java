package com.example.service.impl;

import java.util.Optional;
import javax.ejb.Stateless;
import javax.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import com.example.service.IExampleService;
import com.example.to.ExampleTO;

@Stateless
public class ExampleService implements IExampleService {

//    @Inject
//    @ConfigProperty(name="answer")
//    private Optional<String> answer;
 
    @Inject
    @ConfigProperty(name="app_name")
    private Optional<String> name;

        @Override
        public String whoAmI(ExampleTO to) {
                // Call FooService via ServiceLoader
                try {
                    java.util.ServiceLoader<com.example.foo.FooService> loader = java.util.ServiceLoader.load(com.example.foo.FooService.class);
                    com.example.foo.FooService foo = loader.iterator().hasNext() ? loader.iterator().next() : null;
                    if (foo != null) {
                        // Example call, parameters should be set as needed
                        String result = foo.callMBean("localhost", "8880", "was", "was123", "your.mbean:name=Example", "yourOperation", new Object[]{}, new String[]{});
                        return "FooService result: " + result;
                    } else {
                        return "FooService implementation not found";
                    }
                } catch (Exception e) {
                    return "Error calling FooService: " + e.getMessage();
                }
  
        }
   
}
