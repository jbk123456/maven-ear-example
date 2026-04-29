package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService129 {

    @EJB
    private HelperBeanA129 helperBeanA129;
    @EJB
    private HelperBeanB129 helperBeanB129;
    @EJB
    private HelperBeanC129 helperBeanC129;
    @EJB
    private HelperBeanD129 helperBeanD129;
    @EJB
    private HelperBeanE129 helperBeanE129;
    @EJB
    private HelperBeanF129 helperBeanF129;
    @EJB
    private HelperBeanG129 helperBeanG129;
    @EJB
    private HelperBeanH129 helperBeanH129;
    @EJB
    private HelperBeanI129 helperBeanI129;
    @EJB
    private HelperBeanJ129 helperBeanJ129;
    @EJB
    private HelperBeanK129 helperBeanK129;
    @EJB
    private HelperBeanL129 helperBeanL129;
    @EJB
    private HelperBeanM129 helperBeanM129;
    @EJB
    private HelperBeanN129 helperBeanN129;
    @EJB
    private HelperBeanO129 helperBeanO129;

    @EJB
    private StartupBean129 startupBean129;

    public String whoAmI() {
        return "i'm ExampleService129 "
        + helperBeanA129.identify()
        + helperBeanB129.identify()
        + helperBeanC129.identify()
        + helperBeanD129.identify()
        + helperBeanE129.identify()
        + helperBeanF129.identify()
        + helperBeanG129.identify()
        + helperBeanH129.identify()
        + helperBeanI129.identify()
        + helperBeanJ129.identify()
        + helperBeanK129.identify()
        + helperBeanL129.identify()
        + helperBeanM129.identify()
        + helperBeanN129.identify()
        + helperBeanO129.identify();
    }

}
