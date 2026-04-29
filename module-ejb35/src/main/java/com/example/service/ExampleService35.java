package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService35 {

    @EJB
    private HelperBeanA35 helperBeanA35;
    @EJB
    private HelperBeanB35 helperBeanB35;
    @EJB
    private HelperBeanC35 helperBeanC35;
    @EJB
    private HelperBeanD35 helperBeanD35;
    @EJB
    private HelperBeanE35 helperBeanE35;
    @EJB
    private HelperBeanF35 helperBeanF35;
    @EJB
    private HelperBeanG35 helperBeanG35;
    @EJB
    private HelperBeanH35 helperBeanH35;
    @EJB
    private HelperBeanI35 helperBeanI35;
    @EJB
    private HelperBeanJ35 helperBeanJ35;
    @EJB
    private HelperBeanK35 helperBeanK35;
    @EJB
    private HelperBeanL35 helperBeanL35;
    @EJB
    private HelperBeanM35 helperBeanM35;
    @EJB
    private HelperBeanN35 helperBeanN35;
    @EJB
    private HelperBeanO35 helperBeanO35;

    @EJB
    private StartupBean35 startupBean35;

    public String whoAmI() {
        return "i'm ExampleService35 "
        + helperBeanA35.identify()
        + helperBeanB35.identify()
        + helperBeanC35.identify()
        + helperBeanD35.identify()
        + helperBeanE35.identify()
        + helperBeanF35.identify()
        + helperBeanG35.identify()
        + helperBeanH35.identify()
        + helperBeanI35.identify()
        + helperBeanJ35.identify()
        + helperBeanK35.identify()
        + helperBeanL35.identify()
        + helperBeanM35.identify()
        + helperBeanN35.identify()
        + helperBeanO35.identify();
    }

}
