package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService34 {

    @EJB
    private HelperBeanA34 helperBeanA34;
    @EJB
    private HelperBeanB34 helperBeanB34;
    @EJB
    private HelperBeanC34 helperBeanC34;
    @EJB
    private HelperBeanD34 helperBeanD34;
    @EJB
    private HelperBeanE34 helperBeanE34;
    @EJB
    private HelperBeanF34 helperBeanF34;
    @EJB
    private HelperBeanG34 helperBeanG34;
    @EJB
    private HelperBeanH34 helperBeanH34;
    @EJB
    private HelperBeanI34 helperBeanI34;
    @EJB
    private HelperBeanJ34 helperBeanJ34;
    @EJB
    private HelperBeanK34 helperBeanK34;
    @EJB
    private HelperBeanL34 helperBeanL34;
    @EJB
    private HelperBeanM34 helperBeanM34;
    @EJB
    private HelperBeanN34 helperBeanN34;
    @EJB
    private HelperBeanO34 helperBeanO34;

    @EJB
    private StartupBean34 startupBean34;

    public String whoAmI() {
        return "i'm ExampleService34 "
        + helperBeanA34.identify()
        + helperBeanB34.identify()
        + helperBeanC34.identify()
        + helperBeanD34.identify()
        + helperBeanE34.identify()
        + helperBeanF34.identify()
        + helperBeanG34.identify()
        + helperBeanH34.identify()
        + helperBeanI34.identify()
        + helperBeanJ34.identify()
        + helperBeanK34.identify()
        + helperBeanL34.identify()
        + helperBeanM34.identify()
        + helperBeanN34.identify()
        + helperBeanO34.identify();
    }

}
