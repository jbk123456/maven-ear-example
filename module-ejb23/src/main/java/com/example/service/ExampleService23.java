package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService23 {

    @EJB
    private HelperBeanA23 helperBeanA23;
    @EJB
    private HelperBeanB23 helperBeanB23;
    @EJB
    private HelperBeanC23 helperBeanC23;
    @EJB
    private HelperBeanD23 helperBeanD23;
    @EJB
    private HelperBeanE23 helperBeanE23;
    @EJB
    private HelperBeanF23 helperBeanF23;
    @EJB
    private HelperBeanG23 helperBeanG23;
    @EJB
    private HelperBeanH23 helperBeanH23;
    @EJB
    private HelperBeanI23 helperBeanI23;
    @EJB
    private HelperBeanJ23 helperBeanJ23;
    @EJB
    private HelperBeanK23 helperBeanK23;
    @EJB
    private HelperBeanL23 helperBeanL23;
    @EJB
    private HelperBeanM23 helperBeanM23;
    @EJB
    private HelperBeanN23 helperBeanN23;
    @EJB
    private HelperBeanO23 helperBeanO23;

    @EJB
    private StartupBean23 startupBean23;

    public String whoAmI() {
        return "i'm ExampleService23 "
        + helperBeanA23.identify()
        + helperBeanB23.identify()
        + helperBeanC23.identify()
        + helperBeanD23.identify()
        + helperBeanE23.identify()
        + helperBeanF23.identify()
        + helperBeanG23.identify()
        + helperBeanH23.identify()
        + helperBeanI23.identify()
        + helperBeanJ23.identify()
        + helperBeanK23.identify()
        + helperBeanL23.identify()
        + helperBeanM23.identify()
        + helperBeanN23.identify()
        + helperBeanO23.identify();
    }

}
