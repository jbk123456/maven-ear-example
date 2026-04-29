package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService173 {

    @EJB
    private HelperBeanA173 helperBeanA173;
    @EJB
    private HelperBeanB173 helperBeanB173;
    @EJB
    private HelperBeanC173 helperBeanC173;
    @EJB
    private HelperBeanD173 helperBeanD173;
    @EJB
    private HelperBeanE173 helperBeanE173;
    @EJB
    private HelperBeanF173 helperBeanF173;
    @EJB
    private HelperBeanG173 helperBeanG173;
    @EJB
    private HelperBeanH173 helperBeanH173;
    @EJB
    private HelperBeanI173 helperBeanI173;
    @EJB
    private HelperBeanJ173 helperBeanJ173;
    @EJB
    private HelperBeanK173 helperBeanK173;
    @EJB
    private HelperBeanL173 helperBeanL173;
    @EJB
    private HelperBeanM173 helperBeanM173;
    @EJB
    private HelperBeanN173 helperBeanN173;
    @EJB
    private HelperBeanO173 helperBeanO173;

    @EJB
    private StartupBean173 startupBean173;

    public String whoAmI() {
        return "i'm ExampleService173 "
        + helperBeanA173.identify()
        + helperBeanB173.identify()
        + helperBeanC173.identify()
        + helperBeanD173.identify()
        + helperBeanE173.identify()
        + helperBeanF173.identify()
        + helperBeanG173.identify()
        + helperBeanH173.identify()
        + helperBeanI173.identify()
        + helperBeanJ173.identify()
        + helperBeanK173.identify()
        + helperBeanL173.identify()
        + helperBeanM173.identify()
        + helperBeanN173.identify()
        + helperBeanO173.identify();
    }

}
