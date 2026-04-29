package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService133 {

    @EJB
    private HelperBeanA133 helperBeanA133;
    @EJB
    private HelperBeanB133 helperBeanB133;
    @EJB
    private HelperBeanC133 helperBeanC133;
    @EJB
    private HelperBeanD133 helperBeanD133;
    @EJB
    private HelperBeanE133 helperBeanE133;
    @EJB
    private HelperBeanF133 helperBeanF133;
    @EJB
    private HelperBeanG133 helperBeanG133;
    @EJB
    private HelperBeanH133 helperBeanH133;
    @EJB
    private HelperBeanI133 helperBeanI133;
    @EJB
    private HelperBeanJ133 helperBeanJ133;
    @EJB
    private HelperBeanK133 helperBeanK133;
    @EJB
    private HelperBeanL133 helperBeanL133;
    @EJB
    private HelperBeanM133 helperBeanM133;
    @EJB
    private HelperBeanN133 helperBeanN133;
    @EJB
    private HelperBeanO133 helperBeanO133;

    @EJB
    private StartupBean133 startupBean133;

    public String whoAmI() {
        return "i'm ExampleService133 "
        + helperBeanA133.identify()
        + helperBeanB133.identify()
        + helperBeanC133.identify()
        + helperBeanD133.identify()
        + helperBeanE133.identify()
        + helperBeanF133.identify()
        + helperBeanG133.identify()
        + helperBeanH133.identify()
        + helperBeanI133.identify()
        + helperBeanJ133.identify()
        + helperBeanK133.identify()
        + helperBeanL133.identify()
        + helperBeanM133.identify()
        + helperBeanN133.identify()
        + helperBeanO133.identify();
    }

}
