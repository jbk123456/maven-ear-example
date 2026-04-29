package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService113 {

    @EJB
    private HelperBeanA113 helperBeanA113;
    @EJB
    private HelperBeanB113 helperBeanB113;
    @EJB
    private HelperBeanC113 helperBeanC113;
    @EJB
    private HelperBeanD113 helperBeanD113;
    @EJB
    private HelperBeanE113 helperBeanE113;
    @EJB
    private HelperBeanF113 helperBeanF113;
    @EJB
    private HelperBeanG113 helperBeanG113;
    @EJB
    private HelperBeanH113 helperBeanH113;
    @EJB
    private HelperBeanI113 helperBeanI113;
    @EJB
    private HelperBeanJ113 helperBeanJ113;
    @EJB
    private HelperBeanK113 helperBeanK113;
    @EJB
    private HelperBeanL113 helperBeanL113;
    @EJB
    private HelperBeanM113 helperBeanM113;
    @EJB
    private HelperBeanN113 helperBeanN113;
    @EJB
    private HelperBeanO113 helperBeanO113;

    @EJB
    private StartupBean113 startupBean113;

    public String whoAmI() {
        return "i'm ExampleService113 "
        + helperBeanA113.identify()
        + helperBeanB113.identify()
        + helperBeanC113.identify()
        + helperBeanD113.identify()
        + helperBeanE113.identify()
        + helperBeanF113.identify()
        + helperBeanG113.identify()
        + helperBeanH113.identify()
        + helperBeanI113.identify()
        + helperBeanJ113.identify()
        + helperBeanK113.identify()
        + helperBeanL113.identify()
        + helperBeanM113.identify()
        + helperBeanN113.identify()
        + helperBeanO113.identify();
    }

}
