package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService73 {

    @EJB
    private HelperBeanA73 helperBeanA73;
    @EJB
    private HelperBeanB73 helperBeanB73;
    @EJB
    private HelperBeanC73 helperBeanC73;
    @EJB
    private HelperBeanD73 helperBeanD73;
    @EJB
    private HelperBeanE73 helperBeanE73;
    @EJB
    private HelperBeanF73 helperBeanF73;
    @EJB
    private HelperBeanG73 helperBeanG73;
    @EJB
    private HelperBeanH73 helperBeanH73;
    @EJB
    private HelperBeanI73 helperBeanI73;
    @EJB
    private HelperBeanJ73 helperBeanJ73;
    @EJB
    private HelperBeanK73 helperBeanK73;
    @EJB
    private HelperBeanL73 helperBeanL73;
    @EJB
    private HelperBeanM73 helperBeanM73;
    @EJB
    private HelperBeanN73 helperBeanN73;
    @EJB
    private HelperBeanO73 helperBeanO73;

    @EJB
    private StartupBean73 startupBean73;

    public String whoAmI() {
        return "i'm ExampleService73 "
        + helperBeanA73.identify()
        + helperBeanB73.identify()
        + helperBeanC73.identify()
        + helperBeanD73.identify()
        + helperBeanE73.identify()
        + helperBeanF73.identify()
        + helperBeanG73.identify()
        + helperBeanH73.identify()
        + helperBeanI73.identify()
        + helperBeanJ73.identify()
        + helperBeanK73.identify()
        + helperBeanL73.identify()
        + helperBeanM73.identify()
        + helperBeanN73.identify()
        + helperBeanO73.identify();
    }

}
