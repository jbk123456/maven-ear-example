package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService88 {

    @EJB
    private HelperBeanA88 helperBeanA88;
    @EJB
    private HelperBeanB88 helperBeanB88;
    @EJB
    private HelperBeanC88 helperBeanC88;
    @EJB
    private HelperBeanD88 helperBeanD88;
    @EJB
    private HelperBeanE88 helperBeanE88;
    @EJB
    private HelperBeanF88 helperBeanF88;
    @EJB
    private HelperBeanG88 helperBeanG88;
    @EJB
    private HelperBeanH88 helperBeanH88;
    @EJB
    private HelperBeanI88 helperBeanI88;
    @EJB
    private HelperBeanJ88 helperBeanJ88;
    @EJB
    private HelperBeanK88 helperBeanK88;
    @EJB
    private HelperBeanL88 helperBeanL88;
    @EJB
    private HelperBeanM88 helperBeanM88;
    @EJB
    private HelperBeanN88 helperBeanN88;
    @EJB
    private HelperBeanO88 helperBeanO88;

    @EJB
    private StartupBean88 startupBean88;

    public String whoAmI() {
        return "i'm ExampleService88 "
        + helperBeanA88.identify()
        + helperBeanB88.identify()
        + helperBeanC88.identify()
        + helperBeanD88.identify()
        + helperBeanE88.identify()
        + helperBeanF88.identify()
        + helperBeanG88.identify()
        + helperBeanH88.identify()
        + helperBeanI88.identify()
        + helperBeanJ88.identify()
        + helperBeanK88.identify()
        + helperBeanL88.identify()
        + helperBeanM88.identify()
        + helperBeanN88.identify()
        + helperBeanO88.identify();
    }

}
