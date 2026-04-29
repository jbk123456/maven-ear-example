package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService168 {

    @EJB
    private HelperBeanA168 helperBeanA168;
    @EJB
    private HelperBeanB168 helperBeanB168;
    @EJB
    private HelperBeanC168 helperBeanC168;
    @EJB
    private HelperBeanD168 helperBeanD168;
    @EJB
    private HelperBeanE168 helperBeanE168;
    @EJB
    private HelperBeanF168 helperBeanF168;
    @EJB
    private HelperBeanG168 helperBeanG168;
    @EJB
    private HelperBeanH168 helperBeanH168;
    @EJB
    private HelperBeanI168 helperBeanI168;
    @EJB
    private HelperBeanJ168 helperBeanJ168;
    @EJB
    private HelperBeanK168 helperBeanK168;
    @EJB
    private HelperBeanL168 helperBeanL168;
    @EJB
    private HelperBeanM168 helperBeanM168;
    @EJB
    private HelperBeanN168 helperBeanN168;
    @EJB
    private HelperBeanO168 helperBeanO168;

    @EJB
    private StartupBean168 startupBean168;

    public String whoAmI() {
        return "i'm ExampleService168 "
        + helperBeanA168.identify()
        + helperBeanB168.identify()
        + helperBeanC168.identify()
        + helperBeanD168.identify()
        + helperBeanE168.identify()
        + helperBeanF168.identify()
        + helperBeanG168.identify()
        + helperBeanH168.identify()
        + helperBeanI168.identify()
        + helperBeanJ168.identify()
        + helperBeanK168.identify()
        + helperBeanL168.identify()
        + helperBeanM168.identify()
        + helperBeanN168.identify()
        + helperBeanO168.identify();
    }

}
