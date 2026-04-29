package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService131 {

    @EJB
    private HelperBeanA131 helperBeanA131;
    @EJB
    private HelperBeanB131 helperBeanB131;
    @EJB
    private HelperBeanC131 helperBeanC131;
    @EJB
    private HelperBeanD131 helperBeanD131;
    @EJB
    private HelperBeanE131 helperBeanE131;
    @EJB
    private HelperBeanF131 helperBeanF131;
    @EJB
    private HelperBeanG131 helperBeanG131;
    @EJB
    private HelperBeanH131 helperBeanH131;
    @EJB
    private HelperBeanI131 helperBeanI131;
    @EJB
    private HelperBeanJ131 helperBeanJ131;
    @EJB
    private HelperBeanK131 helperBeanK131;
    @EJB
    private HelperBeanL131 helperBeanL131;
    @EJB
    private HelperBeanM131 helperBeanM131;
    @EJB
    private HelperBeanN131 helperBeanN131;
    @EJB
    private HelperBeanO131 helperBeanO131;

    @EJB
    private StartupBean131 startupBean131;

    public String whoAmI() {
        return "i'm ExampleService131 "
        + helperBeanA131.identify()
        + helperBeanB131.identify()
        + helperBeanC131.identify()
        + helperBeanD131.identify()
        + helperBeanE131.identify()
        + helperBeanF131.identify()
        + helperBeanG131.identify()
        + helperBeanH131.identify()
        + helperBeanI131.identify()
        + helperBeanJ131.identify()
        + helperBeanK131.identify()
        + helperBeanL131.identify()
        + helperBeanM131.identify()
        + helperBeanN131.identify()
        + helperBeanO131.identify();
    }

}
