package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService77 {

    @EJB
    private HelperBeanA77 helperBeanA77;
    @EJB
    private HelperBeanB77 helperBeanB77;
    @EJB
    private HelperBeanC77 helperBeanC77;
    @EJB
    private HelperBeanD77 helperBeanD77;
    @EJB
    private HelperBeanE77 helperBeanE77;
    @EJB
    private HelperBeanF77 helperBeanF77;
    @EJB
    private HelperBeanG77 helperBeanG77;
    @EJB
    private HelperBeanH77 helperBeanH77;
    @EJB
    private HelperBeanI77 helperBeanI77;
    @EJB
    private HelperBeanJ77 helperBeanJ77;
    @EJB
    private HelperBeanK77 helperBeanK77;
    @EJB
    private HelperBeanL77 helperBeanL77;
    @EJB
    private HelperBeanM77 helperBeanM77;
    @EJB
    private HelperBeanN77 helperBeanN77;
    @EJB
    private HelperBeanO77 helperBeanO77;

    @EJB
    private StartupBean77 startupBean77;

    public String whoAmI() {
        return "i'm ExampleService77 "
        + helperBeanA77.identify()
        + helperBeanB77.identify()
        + helperBeanC77.identify()
        + helperBeanD77.identify()
        + helperBeanE77.identify()
        + helperBeanF77.identify()
        + helperBeanG77.identify()
        + helperBeanH77.identify()
        + helperBeanI77.identify()
        + helperBeanJ77.identify()
        + helperBeanK77.identify()
        + helperBeanL77.identify()
        + helperBeanM77.identify()
        + helperBeanN77.identify()
        + helperBeanO77.identify();
    }

}
