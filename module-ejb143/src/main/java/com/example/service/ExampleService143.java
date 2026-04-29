package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService143 {

    @EJB
    private HelperBeanA143 helperBeanA143;
    @EJB
    private HelperBeanB143 helperBeanB143;
    @EJB
    private HelperBeanC143 helperBeanC143;
    @EJB
    private HelperBeanD143 helperBeanD143;
    @EJB
    private HelperBeanE143 helperBeanE143;
    @EJB
    private HelperBeanF143 helperBeanF143;
    @EJB
    private HelperBeanG143 helperBeanG143;
    @EJB
    private HelperBeanH143 helperBeanH143;
    @EJB
    private HelperBeanI143 helperBeanI143;
    @EJB
    private HelperBeanJ143 helperBeanJ143;
    @EJB
    private HelperBeanK143 helperBeanK143;
    @EJB
    private HelperBeanL143 helperBeanL143;
    @EJB
    private HelperBeanM143 helperBeanM143;
    @EJB
    private HelperBeanN143 helperBeanN143;
    @EJB
    private HelperBeanO143 helperBeanO143;

    @EJB
    private StartupBean143 startupBean143;

    public String whoAmI() {
        return "i'm ExampleService143 "
        + helperBeanA143.identify()
        + helperBeanB143.identify()
        + helperBeanC143.identify()
        + helperBeanD143.identify()
        + helperBeanE143.identify()
        + helperBeanF143.identify()
        + helperBeanG143.identify()
        + helperBeanH143.identify()
        + helperBeanI143.identify()
        + helperBeanJ143.identify()
        + helperBeanK143.identify()
        + helperBeanL143.identify()
        + helperBeanM143.identify()
        + helperBeanN143.identify()
        + helperBeanO143.identify();
    }

}
