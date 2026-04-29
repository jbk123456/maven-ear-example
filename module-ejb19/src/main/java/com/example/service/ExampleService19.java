package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService19 {

    @EJB
    private HelperBeanA19 helperBeanA19;
    @EJB
    private HelperBeanB19 helperBeanB19;
    @EJB
    private HelperBeanC19 helperBeanC19;
    @EJB
    private HelperBeanD19 helperBeanD19;
    @EJB
    private HelperBeanE19 helperBeanE19;
    @EJB
    private HelperBeanF19 helperBeanF19;
    @EJB
    private HelperBeanG19 helperBeanG19;
    @EJB
    private HelperBeanH19 helperBeanH19;
    @EJB
    private HelperBeanI19 helperBeanI19;
    @EJB
    private HelperBeanJ19 helperBeanJ19;
    @EJB
    private HelperBeanK19 helperBeanK19;
    @EJB
    private HelperBeanL19 helperBeanL19;
    @EJB
    private HelperBeanM19 helperBeanM19;
    @EJB
    private HelperBeanN19 helperBeanN19;
    @EJB
    private HelperBeanO19 helperBeanO19;

    @EJB
    private StartupBean19 startupBean19;

    public String whoAmI() {
        return "i'm ExampleService19 "
        + helperBeanA19.identify()
        + helperBeanB19.identify()
        + helperBeanC19.identify()
        + helperBeanD19.identify()
        + helperBeanE19.identify()
        + helperBeanF19.identify()
        + helperBeanG19.identify()
        + helperBeanH19.identify()
        + helperBeanI19.identify()
        + helperBeanJ19.identify()
        + helperBeanK19.identify()
        + helperBeanL19.identify()
        + helperBeanM19.identify()
        + helperBeanN19.identify()
        + helperBeanO19.identify();
    }

}
