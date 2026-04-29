package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService17 {

    @EJB
    private HelperBeanA17 helperBeanA17;
    @EJB
    private HelperBeanB17 helperBeanB17;
    @EJB
    private HelperBeanC17 helperBeanC17;
    @EJB
    private HelperBeanD17 helperBeanD17;
    @EJB
    private HelperBeanE17 helperBeanE17;
    @EJB
    private HelperBeanF17 helperBeanF17;
    @EJB
    private HelperBeanG17 helperBeanG17;
    @EJB
    private HelperBeanH17 helperBeanH17;
    @EJB
    private HelperBeanI17 helperBeanI17;
    @EJB
    private HelperBeanJ17 helperBeanJ17;
    @EJB
    private HelperBeanK17 helperBeanK17;
    @EJB
    private HelperBeanL17 helperBeanL17;
    @EJB
    private HelperBeanM17 helperBeanM17;
    @EJB
    private HelperBeanN17 helperBeanN17;
    @EJB
    private HelperBeanO17 helperBeanO17;

    @EJB
    private StartupBean17 startupBean17;

    public String whoAmI() {
        return "i'm ExampleService17 "
        + helperBeanA17.identify()
        + helperBeanB17.identify()
        + helperBeanC17.identify()
        + helperBeanD17.identify()
        + helperBeanE17.identify()
        + helperBeanF17.identify()
        + helperBeanG17.identify()
        + helperBeanH17.identify()
        + helperBeanI17.identify()
        + helperBeanJ17.identify()
        + helperBeanK17.identify()
        + helperBeanL17.identify()
        + helperBeanM17.identify()
        + helperBeanN17.identify()
        + helperBeanO17.identify();
    }

}
