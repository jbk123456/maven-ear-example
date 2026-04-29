package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService162 {

    @EJB
    private HelperBeanA162 helperBeanA162;
    @EJB
    private HelperBeanB162 helperBeanB162;
    @EJB
    private HelperBeanC162 helperBeanC162;
    @EJB
    private HelperBeanD162 helperBeanD162;
    @EJB
    private HelperBeanE162 helperBeanE162;
    @EJB
    private HelperBeanF162 helperBeanF162;
    @EJB
    private HelperBeanG162 helperBeanG162;
    @EJB
    private HelperBeanH162 helperBeanH162;
    @EJB
    private HelperBeanI162 helperBeanI162;
    @EJB
    private HelperBeanJ162 helperBeanJ162;
    @EJB
    private HelperBeanK162 helperBeanK162;
    @EJB
    private HelperBeanL162 helperBeanL162;
    @EJB
    private HelperBeanM162 helperBeanM162;
    @EJB
    private HelperBeanN162 helperBeanN162;
    @EJB
    private HelperBeanO162 helperBeanO162;

    @EJB
    private StartupBean162 startupBean162;

    public String whoAmI() {
        return "i'm ExampleService162 "
        + helperBeanA162.identify()
        + helperBeanB162.identify()
        + helperBeanC162.identify()
        + helperBeanD162.identify()
        + helperBeanE162.identify()
        + helperBeanF162.identify()
        + helperBeanG162.identify()
        + helperBeanH162.identify()
        + helperBeanI162.identify()
        + helperBeanJ162.identify()
        + helperBeanK162.identify()
        + helperBeanL162.identify()
        + helperBeanM162.identify()
        + helperBeanN162.identify()
        + helperBeanO162.identify();
    }

}
