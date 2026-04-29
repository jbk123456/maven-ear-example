package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService152 {

    @EJB
    private HelperBeanA152 helperBeanA152;
    @EJB
    private HelperBeanB152 helperBeanB152;
    @EJB
    private HelperBeanC152 helperBeanC152;
    @EJB
    private HelperBeanD152 helperBeanD152;
    @EJB
    private HelperBeanE152 helperBeanE152;
    @EJB
    private HelperBeanF152 helperBeanF152;
    @EJB
    private HelperBeanG152 helperBeanG152;
    @EJB
    private HelperBeanH152 helperBeanH152;
    @EJB
    private HelperBeanI152 helperBeanI152;
    @EJB
    private HelperBeanJ152 helperBeanJ152;
    @EJB
    private HelperBeanK152 helperBeanK152;
    @EJB
    private HelperBeanL152 helperBeanL152;
    @EJB
    private HelperBeanM152 helperBeanM152;
    @EJB
    private HelperBeanN152 helperBeanN152;
    @EJB
    private HelperBeanO152 helperBeanO152;

    @EJB
    private StartupBean152 startupBean152;

    public String whoAmI() {
        return "i'm ExampleService152 "
        + helperBeanA152.identify()
        + helperBeanB152.identify()
        + helperBeanC152.identify()
        + helperBeanD152.identify()
        + helperBeanE152.identify()
        + helperBeanF152.identify()
        + helperBeanG152.identify()
        + helperBeanH152.identify()
        + helperBeanI152.identify()
        + helperBeanJ152.identify()
        + helperBeanK152.identify()
        + helperBeanL152.identify()
        + helperBeanM152.identify()
        + helperBeanN152.identify()
        + helperBeanO152.identify();
    }

}
