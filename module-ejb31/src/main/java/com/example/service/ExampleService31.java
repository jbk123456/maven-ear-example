package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService31 {

    @EJB
    private HelperBeanA31 helperBeanA31;
    @EJB
    private HelperBeanB31 helperBeanB31;
    @EJB
    private HelperBeanC31 helperBeanC31;
    @EJB
    private HelperBeanD31 helperBeanD31;
    @EJB
    private HelperBeanE31 helperBeanE31;
    @EJB
    private HelperBeanF31 helperBeanF31;
    @EJB
    private HelperBeanG31 helperBeanG31;
    @EJB
    private HelperBeanH31 helperBeanH31;
    @EJB
    private HelperBeanI31 helperBeanI31;
    @EJB
    private HelperBeanJ31 helperBeanJ31;
    @EJB
    private HelperBeanK31 helperBeanK31;
    @EJB
    private HelperBeanL31 helperBeanL31;
    @EJB
    private HelperBeanM31 helperBeanM31;
    @EJB
    private HelperBeanN31 helperBeanN31;
    @EJB
    private HelperBeanO31 helperBeanO31;

    @EJB
    private StartupBean31 startupBean31;

    public String whoAmI() {
        return "i'm ExampleService31 "
        + helperBeanA31.identify()
        + helperBeanB31.identify()
        + helperBeanC31.identify()
        + helperBeanD31.identify()
        + helperBeanE31.identify()
        + helperBeanF31.identify()
        + helperBeanG31.identify()
        + helperBeanH31.identify()
        + helperBeanI31.identify()
        + helperBeanJ31.identify()
        + helperBeanK31.identify()
        + helperBeanL31.identify()
        + helperBeanM31.identify()
        + helperBeanN31.identify()
        + helperBeanO31.identify();
    }

}
