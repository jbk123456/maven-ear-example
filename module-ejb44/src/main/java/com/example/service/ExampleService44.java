package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService44 {

    @EJB
    private HelperBeanA44 helperBeanA44;
    @EJB
    private HelperBeanB44 helperBeanB44;
    @EJB
    private HelperBeanC44 helperBeanC44;
    @EJB
    private HelperBeanD44 helperBeanD44;
    @EJB
    private HelperBeanE44 helperBeanE44;
    @EJB
    private HelperBeanF44 helperBeanF44;
    @EJB
    private HelperBeanG44 helperBeanG44;
    @EJB
    private HelperBeanH44 helperBeanH44;
    @EJB
    private HelperBeanI44 helperBeanI44;
    @EJB
    private HelperBeanJ44 helperBeanJ44;
    @EJB
    private HelperBeanK44 helperBeanK44;
    @EJB
    private HelperBeanL44 helperBeanL44;
    @EJB
    private HelperBeanM44 helperBeanM44;
    @EJB
    private HelperBeanN44 helperBeanN44;
    @EJB
    private HelperBeanO44 helperBeanO44;

    @EJB
    private StartupBean44 startupBean44;

    public String whoAmI() {
        return "i'm ExampleService44 "
        + helperBeanA44.identify()
        + helperBeanB44.identify()
        + helperBeanC44.identify()
        + helperBeanD44.identify()
        + helperBeanE44.identify()
        + helperBeanF44.identify()
        + helperBeanG44.identify()
        + helperBeanH44.identify()
        + helperBeanI44.identify()
        + helperBeanJ44.identify()
        + helperBeanK44.identify()
        + helperBeanL44.identify()
        + helperBeanM44.identify()
        + helperBeanN44.identify()
        + helperBeanO44.identify();
    }

}
