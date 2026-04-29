package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService146 {

    @EJB
    private HelperBeanA146 helperBeanA146;
    @EJB
    private HelperBeanB146 helperBeanB146;
    @EJB
    private HelperBeanC146 helperBeanC146;
    @EJB
    private HelperBeanD146 helperBeanD146;
    @EJB
    private HelperBeanE146 helperBeanE146;
    @EJB
    private HelperBeanF146 helperBeanF146;
    @EJB
    private HelperBeanG146 helperBeanG146;
    @EJB
    private HelperBeanH146 helperBeanH146;
    @EJB
    private HelperBeanI146 helperBeanI146;
    @EJB
    private HelperBeanJ146 helperBeanJ146;
    @EJB
    private HelperBeanK146 helperBeanK146;
    @EJB
    private HelperBeanL146 helperBeanL146;
    @EJB
    private HelperBeanM146 helperBeanM146;
    @EJB
    private HelperBeanN146 helperBeanN146;
    @EJB
    private HelperBeanO146 helperBeanO146;

    @EJB
    private StartupBean146 startupBean146;

    public String whoAmI() {
        return "i'm ExampleService146 "
        + helperBeanA146.identify()
        + helperBeanB146.identify()
        + helperBeanC146.identify()
        + helperBeanD146.identify()
        + helperBeanE146.identify()
        + helperBeanF146.identify()
        + helperBeanG146.identify()
        + helperBeanH146.identify()
        + helperBeanI146.identify()
        + helperBeanJ146.identify()
        + helperBeanK146.identify()
        + helperBeanL146.identify()
        + helperBeanM146.identify()
        + helperBeanN146.identify()
        + helperBeanO146.identify();
    }

}
