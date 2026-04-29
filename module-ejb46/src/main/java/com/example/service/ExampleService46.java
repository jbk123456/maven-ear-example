package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService46 {

    @EJB
    private HelperBeanA46 helperBeanA46;
    @EJB
    private HelperBeanB46 helperBeanB46;
    @EJB
    private HelperBeanC46 helperBeanC46;
    @EJB
    private HelperBeanD46 helperBeanD46;
    @EJB
    private HelperBeanE46 helperBeanE46;
    @EJB
    private HelperBeanF46 helperBeanF46;
    @EJB
    private HelperBeanG46 helperBeanG46;
    @EJB
    private HelperBeanH46 helperBeanH46;
    @EJB
    private HelperBeanI46 helperBeanI46;
    @EJB
    private HelperBeanJ46 helperBeanJ46;
    @EJB
    private HelperBeanK46 helperBeanK46;
    @EJB
    private HelperBeanL46 helperBeanL46;
    @EJB
    private HelperBeanM46 helperBeanM46;
    @EJB
    private HelperBeanN46 helperBeanN46;
    @EJB
    private HelperBeanO46 helperBeanO46;

    @EJB
    private StartupBean46 startupBean46;

    public String whoAmI() {
        return "i'm ExampleService46 "
        + helperBeanA46.identify()
        + helperBeanB46.identify()
        + helperBeanC46.identify()
        + helperBeanD46.identify()
        + helperBeanE46.identify()
        + helperBeanF46.identify()
        + helperBeanG46.identify()
        + helperBeanH46.identify()
        + helperBeanI46.identify()
        + helperBeanJ46.identify()
        + helperBeanK46.identify()
        + helperBeanL46.identify()
        + helperBeanM46.identify()
        + helperBeanN46.identify()
        + helperBeanO46.identify();
    }

}
