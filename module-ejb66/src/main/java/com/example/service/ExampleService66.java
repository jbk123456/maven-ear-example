package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService66 {

    @EJB
    private HelperBeanA66 helperBeanA66;
    @EJB
    private HelperBeanB66 helperBeanB66;
    @EJB
    private HelperBeanC66 helperBeanC66;
    @EJB
    private HelperBeanD66 helperBeanD66;
    @EJB
    private HelperBeanE66 helperBeanE66;
    @EJB
    private HelperBeanF66 helperBeanF66;
    @EJB
    private HelperBeanG66 helperBeanG66;
    @EJB
    private HelperBeanH66 helperBeanH66;
    @EJB
    private HelperBeanI66 helperBeanI66;
    @EJB
    private HelperBeanJ66 helperBeanJ66;
    @EJB
    private HelperBeanK66 helperBeanK66;
    @EJB
    private HelperBeanL66 helperBeanL66;
    @EJB
    private HelperBeanM66 helperBeanM66;
    @EJB
    private HelperBeanN66 helperBeanN66;
    @EJB
    private HelperBeanO66 helperBeanO66;

    @EJB
    private StartupBean66 startupBean66;

    public String whoAmI() {
        return "i'm ExampleService66 "
        + helperBeanA66.identify()
        + helperBeanB66.identify()
        + helperBeanC66.identify()
        + helperBeanD66.identify()
        + helperBeanE66.identify()
        + helperBeanF66.identify()
        + helperBeanG66.identify()
        + helperBeanH66.identify()
        + helperBeanI66.identify()
        + helperBeanJ66.identify()
        + helperBeanK66.identify()
        + helperBeanL66.identify()
        + helperBeanM66.identify()
        + helperBeanN66.identify()
        + helperBeanO66.identify();
    }

}
