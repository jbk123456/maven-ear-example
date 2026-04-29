package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService86 {

    @EJB
    private HelperBeanA86 helperBeanA86;
    @EJB
    private HelperBeanB86 helperBeanB86;
    @EJB
    private HelperBeanC86 helperBeanC86;
    @EJB
    private HelperBeanD86 helperBeanD86;
    @EJB
    private HelperBeanE86 helperBeanE86;
    @EJB
    private HelperBeanF86 helperBeanF86;
    @EJB
    private HelperBeanG86 helperBeanG86;
    @EJB
    private HelperBeanH86 helperBeanH86;
    @EJB
    private HelperBeanI86 helperBeanI86;
    @EJB
    private HelperBeanJ86 helperBeanJ86;
    @EJB
    private HelperBeanK86 helperBeanK86;
    @EJB
    private HelperBeanL86 helperBeanL86;
    @EJB
    private HelperBeanM86 helperBeanM86;
    @EJB
    private HelperBeanN86 helperBeanN86;
    @EJB
    private HelperBeanO86 helperBeanO86;

    @EJB
    private StartupBean86 startupBean86;

    public String whoAmI() {
        return "i'm ExampleService86 "
        + helperBeanA86.identify()
        + helperBeanB86.identify()
        + helperBeanC86.identify()
        + helperBeanD86.identify()
        + helperBeanE86.identify()
        + helperBeanF86.identify()
        + helperBeanG86.identify()
        + helperBeanH86.identify()
        + helperBeanI86.identify()
        + helperBeanJ86.identify()
        + helperBeanK86.identify()
        + helperBeanL86.identify()
        + helperBeanM86.identify()
        + helperBeanN86.identify()
        + helperBeanO86.identify();
    }

}
