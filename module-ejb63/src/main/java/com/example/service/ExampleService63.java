package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService63 {

    @EJB
    private HelperBeanA63 helperBeanA63;
    @EJB
    private HelperBeanB63 helperBeanB63;
    @EJB
    private HelperBeanC63 helperBeanC63;
    @EJB
    private HelperBeanD63 helperBeanD63;
    @EJB
    private HelperBeanE63 helperBeanE63;
    @EJB
    private HelperBeanF63 helperBeanF63;
    @EJB
    private HelperBeanG63 helperBeanG63;
    @EJB
    private HelperBeanH63 helperBeanH63;
    @EJB
    private HelperBeanI63 helperBeanI63;
    @EJB
    private HelperBeanJ63 helperBeanJ63;
    @EJB
    private HelperBeanK63 helperBeanK63;
    @EJB
    private HelperBeanL63 helperBeanL63;
    @EJB
    private HelperBeanM63 helperBeanM63;
    @EJB
    private HelperBeanN63 helperBeanN63;
    @EJB
    private HelperBeanO63 helperBeanO63;

    @EJB
    private StartupBean63 startupBean63;

    public String whoAmI() {
        return "i'm ExampleService63 "
        + helperBeanA63.identify()
        + helperBeanB63.identify()
        + helperBeanC63.identify()
        + helperBeanD63.identify()
        + helperBeanE63.identify()
        + helperBeanF63.identify()
        + helperBeanG63.identify()
        + helperBeanH63.identify()
        + helperBeanI63.identify()
        + helperBeanJ63.identify()
        + helperBeanK63.identify()
        + helperBeanL63.identify()
        + helperBeanM63.identify()
        + helperBeanN63.identify()
        + helperBeanO63.identify();
    }

}
