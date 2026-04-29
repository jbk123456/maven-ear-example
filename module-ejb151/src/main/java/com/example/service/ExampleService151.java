package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService151 {

    @EJB
    private HelperBeanA151 helperBeanA151;
    @EJB
    private HelperBeanB151 helperBeanB151;
    @EJB
    private HelperBeanC151 helperBeanC151;
    @EJB
    private HelperBeanD151 helperBeanD151;
    @EJB
    private HelperBeanE151 helperBeanE151;
    @EJB
    private HelperBeanF151 helperBeanF151;
    @EJB
    private HelperBeanG151 helperBeanG151;
    @EJB
    private HelperBeanH151 helperBeanH151;
    @EJB
    private HelperBeanI151 helperBeanI151;
    @EJB
    private HelperBeanJ151 helperBeanJ151;
    @EJB
    private HelperBeanK151 helperBeanK151;
    @EJB
    private HelperBeanL151 helperBeanL151;
    @EJB
    private HelperBeanM151 helperBeanM151;
    @EJB
    private HelperBeanN151 helperBeanN151;
    @EJB
    private HelperBeanO151 helperBeanO151;

    @EJB
    private StartupBean151 startupBean151;

    public String whoAmI() {
        return "i'm ExampleService151 "
        + helperBeanA151.identify()
        + helperBeanB151.identify()
        + helperBeanC151.identify()
        + helperBeanD151.identify()
        + helperBeanE151.identify()
        + helperBeanF151.identify()
        + helperBeanG151.identify()
        + helperBeanH151.identify()
        + helperBeanI151.identify()
        + helperBeanJ151.identify()
        + helperBeanK151.identify()
        + helperBeanL151.identify()
        + helperBeanM151.identify()
        + helperBeanN151.identify()
        + helperBeanO151.identify();
    }

}
