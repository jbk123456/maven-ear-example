package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService26 {

    @EJB
    private HelperBeanA26 helperBeanA26;
    @EJB
    private HelperBeanB26 helperBeanB26;
    @EJB
    private HelperBeanC26 helperBeanC26;
    @EJB
    private HelperBeanD26 helperBeanD26;
    @EJB
    private HelperBeanE26 helperBeanE26;
    @EJB
    private HelperBeanF26 helperBeanF26;
    @EJB
    private HelperBeanG26 helperBeanG26;
    @EJB
    private HelperBeanH26 helperBeanH26;
    @EJB
    private HelperBeanI26 helperBeanI26;
    @EJB
    private HelperBeanJ26 helperBeanJ26;
    @EJB
    private HelperBeanK26 helperBeanK26;
    @EJB
    private HelperBeanL26 helperBeanL26;
    @EJB
    private HelperBeanM26 helperBeanM26;
    @EJB
    private HelperBeanN26 helperBeanN26;
    @EJB
    private HelperBeanO26 helperBeanO26;

    @EJB
    private StartupBean26 startupBean26;

    public String whoAmI() {
        return "i'm ExampleService26 "
        + helperBeanA26.identify()
        + helperBeanB26.identify()
        + helperBeanC26.identify()
        + helperBeanD26.identify()
        + helperBeanE26.identify()
        + helperBeanF26.identify()
        + helperBeanG26.identify()
        + helperBeanH26.identify()
        + helperBeanI26.identify()
        + helperBeanJ26.identify()
        + helperBeanK26.identify()
        + helperBeanL26.identify()
        + helperBeanM26.identify()
        + helperBeanN26.identify()
        + helperBeanO26.identify();
    }

}
