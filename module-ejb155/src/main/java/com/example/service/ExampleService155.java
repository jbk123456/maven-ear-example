package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService155 {

    @EJB
    private HelperBeanA155 helperBeanA155;
    @EJB
    private HelperBeanB155 helperBeanB155;
    @EJB
    private HelperBeanC155 helperBeanC155;
    @EJB
    private HelperBeanD155 helperBeanD155;
    @EJB
    private HelperBeanE155 helperBeanE155;
    @EJB
    private HelperBeanF155 helperBeanF155;
    @EJB
    private HelperBeanG155 helperBeanG155;
    @EJB
    private HelperBeanH155 helperBeanH155;
    @EJB
    private HelperBeanI155 helperBeanI155;
    @EJB
    private HelperBeanJ155 helperBeanJ155;
    @EJB
    private HelperBeanK155 helperBeanK155;
    @EJB
    private HelperBeanL155 helperBeanL155;
    @EJB
    private HelperBeanM155 helperBeanM155;
    @EJB
    private HelperBeanN155 helperBeanN155;
    @EJB
    private HelperBeanO155 helperBeanO155;

    @EJB
    private StartupBean155 startupBean155;

    public String whoAmI() {
        return "i'm ExampleService155 "
        + helperBeanA155.identify()
        + helperBeanB155.identify()
        + helperBeanC155.identify()
        + helperBeanD155.identify()
        + helperBeanE155.identify()
        + helperBeanF155.identify()
        + helperBeanG155.identify()
        + helperBeanH155.identify()
        + helperBeanI155.identify()
        + helperBeanJ155.identify()
        + helperBeanK155.identify()
        + helperBeanL155.identify()
        + helperBeanM155.identify()
        + helperBeanN155.identify()
        + helperBeanO155.identify();
    }

}
