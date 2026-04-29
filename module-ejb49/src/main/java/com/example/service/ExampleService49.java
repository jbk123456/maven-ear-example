package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService49 {

    @EJB
    private HelperBeanA49 helperBeanA49;
    @EJB
    private HelperBeanB49 helperBeanB49;
    @EJB
    private HelperBeanC49 helperBeanC49;
    @EJB
    private HelperBeanD49 helperBeanD49;
    @EJB
    private HelperBeanE49 helperBeanE49;
    @EJB
    private HelperBeanF49 helperBeanF49;
    @EJB
    private HelperBeanG49 helperBeanG49;
    @EJB
    private HelperBeanH49 helperBeanH49;
    @EJB
    private HelperBeanI49 helperBeanI49;
    @EJB
    private HelperBeanJ49 helperBeanJ49;
    @EJB
    private HelperBeanK49 helperBeanK49;
    @EJB
    private HelperBeanL49 helperBeanL49;
    @EJB
    private HelperBeanM49 helperBeanM49;
    @EJB
    private HelperBeanN49 helperBeanN49;
    @EJB
    private HelperBeanO49 helperBeanO49;

    @EJB
    private StartupBean49 startupBean49;

    public String whoAmI() {
        return "i'm ExampleService49 "
        + helperBeanA49.identify()
        + helperBeanB49.identify()
        + helperBeanC49.identify()
        + helperBeanD49.identify()
        + helperBeanE49.identify()
        + helperBeanF49.identify()
        + helperBeanG49.identify()
        + helperBeanH49.identify()
        + helperBeanI49.identify()
        + helperBeanJ49.identify()
        + helperBeanK49.identify()
        + helperBeanL49.identify()
        + helperBeanM49.identify()
        + helperBeanN49.identify()
        + helperBeanO49.identify();
    }

}
