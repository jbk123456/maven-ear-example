package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService81 {

    @EJB
    private HelperBeanA81 helperBeanA81;
    @EJB
    private HelperBeanB81 helperBeanB81;
    @EJB
    private HelperBeanC81 helperBeanC81;
    @EJB
    private HelperBeanD81 helperBeanD81;
    @EJB
    private HelperBeanE81 helperBeanE81;
    @EJB
    private HelperBeanF81 helperBeanF81;
    @EJB
    private HelperBeanG81 helperBeanG81;
    @EJB
    private HelperBeanH81 helperBeanH81;
    @EJB
    private HelperBeanI81 helperBeanI81;
    @EJB
    private HelperBeanJ81 helperBeanJ81;
    @EJB
    private HelperBeanK81 helperBeanK81;
    @EJB
    private HelperBeanL81 helperBeanL81;
    @EJB
    private HelperBeanM81 helperBeanM81;
    @EJB
    private HelperBeanN81 helperBeanN81;
    @EJB
    private HelperBeanO81 helperBeanO81;

    @EJB
    private StartupBean81 startupBean81;

    public String whoAmI() {
        return "i'm ExampleService81 "
        + helperBeanA81.identify()
        + helperBeanB81.identify()
        + helperBeanC81.identify()
        + helperBeanD81.identify()
        + helperBeanE81.identify()
        + helperBeanF81.identify()
        + helperBeanG81.identify()
        + helperBeanH81.identify()
        + helperBeanI81.identify()
        + helperBeanJ81.identify()
        + helperBeanK81.identify()
        + helperBeanL81.identify()
        + helperBeanM81.identify()
        + helperBeanN81.identify()
        + helperBeanO81.identify();
    }

}
