package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService150 {

    @EJB
    private HelperBeanA150 helperBeanA150;
    @EJB
    private HelperBeanB150 helperBeanB150;
    @EJB
    private HelperBeanC150 helperBeanC150;
    @EJB
    private HelperBeanD150 helperBeanD150;
    @EJB
    private HelperBeanE150 helperBeanE150;
    @EJB
    private HelperBeanF150 helperBeanF150;
    @EJB
    private HelperBeanG150 helperBeanG150;
    @EJB
    private HelperBeanH150 helperBeanH150;
    @EJB
    private HelperBeanI150 helperBeanI150;
    @EJB
    private HelperBeanJ150 helperBeanJ150;
    @EJB
    private HelperBeanK150 helperBeanK150;
    @EJB
    private HelperBeanL150 helperBeanL150;
    @EJB
    private HelperBeanM150 helperBeanM150;
    @EJB
    private HelperBeanN150 helperBeanN150;
    @EJB
    private HelperBeanO150 helperBeanO150;

    @EJB
    private StartupBean150 startupBean150;

    public String whoAmI() {
        return "i'm ExampleService150 "
        + helperBeanA150.identify()
        + helperBeanB150.identify()
        + helperBeanC150.identify()
        + helperBeanD150.identify()
        + helperBeanE150.identify()
        + helperBeanF150.identify()
        + helperBeanG150.identify()
        + helperBeanH150.identify()
        + helperBeanI150.identify()
        + helperBeanJ150.identify()
        + helperBeanK150.identify()
        + helperBeanL150.identify()
        + helperBeanM150.identify()
        + helperBeanN150.identify()
        + helperBeanO150.identify();
    }

}
