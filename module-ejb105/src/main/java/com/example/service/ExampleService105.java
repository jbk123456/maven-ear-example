package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService105 {

    @EJB
    private HelperBeanA105 helperBeanA105;
    @EJB
    private HelperBeanB105 helperBeanB105;
    @EJB
    private HelperBeanC105 helperBeanC105;
    @EJB
    private HelperBeanD105 helperBeanD105;
    @EJB
    private HelperBeanE105 helperBeanE105;
    @EJB
    private HelperBeanF105 helperBeanF105;
    @EJB
    private HelperBeanG105 helperBeanG105;
    @EJB
    private HelperBeanH105 helperBeanH105;
    @EJB
    private HelperBeanI105 helperBeanI105;
    @EJB
    private HelperBeanJ105 helperBeanJ105;
    @EJB
    private HelperBeanK105 helperBeanK105;
    @EJB
    private HelperBeanL105 helperBeanL105;
    @EJB
    private HelperBeanM105 helperBeanM105;
    @EJB
    private HelperBeanN105 helperBeanN105;
    @EJB
    private HelperBeanO105 helperBeanO105;

    @EJB
    private StartupBean105 startupBean105;

    public String whoAmI() {
        return "i'm ExampleService105 "
        + helperBeanA105.identify()
        + helperBeanB105.identify()
        + helperBeanC105.identify()
        + helperBeanD105.identify()
        + helperBeanE105.identify()
        + helperBeanF105.identify()
        + helperBeanG105.identify()
        + helperBeanH105.identify()
        + helperBeanI105.identify()
        + helperBeanJ105.identify()
        + helperBeanK105.identify()
        + helperBeanL105.identify()
        + helperBeanM105.identify()
        + helperBeanN105.identify()
        + helperBeanO105.identify();
    }

}
