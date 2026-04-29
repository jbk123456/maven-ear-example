package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService11 {

    @EJB
    private HelperBeanA11 helperBeanA11;
    @EJB
    private HelperBeanB11 helperBeanB11;
    @EJB
    private HelperBeanC11 helperBeanC11;
    @EJB
    private HelperBeanD11 helperBeanD11;
    @EJB
    private HelperBeanE11 helperBeanE11;
    @EJB
    private HelperBeanF11 helperBeanF11;
    @EJB
    private HelperBeanG11 helperBeanG11;
    @EJB
    private HelperBeanH11 helperBeanH11;
    @EJB
    private HelperBeanI11 helperBeanI11;
    @EJB
    private HelperBeanJ11 helperBeanJ11;
    @EJB
    private HelperBeanK11 helperBeanK11;
    @EJB
    private HelperBeanL11 helperBeanL11;
    @EJB
    private HelperBeanM11 helperBeanM11;
    @EJB
    private HelperBeanN11 helperBeanN11;
    @EJB
    private HelperBeanO11 helperBeanO11;

    @EJB
    private StartupBean11 startupBean11;

    public String whoAmI() {
        return "i'm ExampleService11 "
        + helperBeanA11.identify()
        + helperBeanB11.identify()
        + helperBeanC11.identify()
        + helperBeanD11.identify()
        + helperBeanE11.identify()
        + helperBeanF11.identify()
        + helperBeanG11.identify()
        + helperBeanH11.identify()
        + helperBeanI11.identify()
        + helperBeanJ11.identify()
        + helperBeanK11.identify()
        + helperBeanL11.identify()
        + helperBeanM11.identify()
        + helperBeanN11.identify()
        + helperBeanO11.identify();
    }

}
