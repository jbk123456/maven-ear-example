package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService118 {

    @EJB
    private HelperBeanA118 helperBeanA118;
    @EJB
    private HelperBeanB118 helperBeanB118;
    @EJB
    private HelperBeanC118 helperBeanC118;
    @EJB
    private HelperBeanD118 helperBeanD118;
    @EJB
    private HelperBeanE118 helperBeanE118;
    @EJB
    private HelperBeanF118 helperBeanF118;
    @EJB
    private HelperBeanG118 helperBeanG118;
    @EJB
    private HelperBeanH118 helperBeanH118;
    @EJB
    private HelperBeanI118 helperBeanI118;
    @EJB
    private HelperBeanJ118 helperBeanJ118;
    @EJB
    private HelperBeanK118 helperBeanK118;
    @EJB
    private HelperBeanL118 helperBeanL118;
    @EJB
    private HelperBeanM118 helperBeanM118;
    @EJB
    private HelperBeanN118 helperBeanN118;
    @EJB
    private HelperBeanO118 helperBeanO118;

    @EJB
    private StartupBean118 startupBean118;

    public String whoAmI() {
        return "i'm ExampleService118 "
        + helperBeanA118.identify()
        + helperBeanB118.identify()
        + helperBeanC118.identify()
        + helperBeanD118.identify()
        + helperBeanE118.identify()
        + helperBeanF118.identify()
        + helperBeanG118.identify()
        + helperBeanH118.identify()
        + helperBeanI118.identify()
        + helperBeanJ118.identify()
        + helperBeanK118.identify()
        + helperBeanL118.identify()
        + helperBeanM118.identify()
        + helperBeanN118.identify()
        + helperBeanO118.identify();
    }

}
