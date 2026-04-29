package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService75 {

    @EJB
    private HelperBeanA75 helperBeanA75;
    @EJB
    private HelperBeanB75 helperBeanB75;
    @EJB
    private HelperBeanC75 helperBeanC75;
    @EJB
    private HelperBeanD75 helperBeanD75;
    @EJB
    private HelperBeanE75 helperBeanE75;
    @EJB
    private HelperBeanF75 helperBeanF75;
    @EJB
    private HelperBeanG75 helperBeanG75;
    @EJB
    private HelperBeanH75 helperBeanH75;
    @EJB
    private HelperBeanI75 helperBeanI75;
    @EJB
    private HelperBeanJ75 helperBeanJ75;
    @EJB
    private HelperBeanK75 helperBeanK75;
    @EJB
    private HelperBeanL75 helperBeanL75;
    @EJB
    private HelperBeanM75 helperBeanM75;
    @EJB
    private HelperBeanN75 helperBeanN75;
    @EJB
    private HelperBeanO75 helperBeanO75;

    @EJB
    private StartupBean75 startupBean75;

    public String whoAmI() {
        return "i'm ExampleService75 "
        + helperBeanA75.identify()
        + helperBeanB75.identify()
        + helperBeanC75.identify()
        + helperBeanD75.identify()
        + helperBeanE75.identify()
        + helperBeanF75.identify()
        + helperBeanG75.identify()
        + helperBeanH75.identify()
        + helperBeanI75.identify()
        + helperBeanJ75.identify()
        + helperBeanK75.identify()
        + helperBeanL75.identify()
        + helperBeanM75.identify()
        + helperBeanN75.identify()
        + helperBeanO75.identify();
    }

}
