package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService149 {

    @EJB
    private HelperBeanA149 helperBeanA149;
    @EJB
    private HelperBeanB149 helperBeanB149;
    @EJB
    private HelperBeanC149 helperBeanC149;
    @EJB
    private HelperBeanD149 helperBeanD149;
    @EJB
    private HelperBeanE149 helperBeanE149;
    @EJB
    private HelperBeanF149 helperBeanF149;
    @EJB
    private HelperBeanG149 helperBeanG149;
    @EJB
    private HelperBeanH149 helperBeanH149;
    @EJB
    private HelperBeanI149 helperBeanI149;
    @EJB
    private HelperBeanJ149 helperBeanJ149;
    @EJB
    private HelperBeanK149 helperBeanK149;
    @EJB
    private HelperBeanL149 helperBeanL149;
    @EJB
    private HelperBeanM149 helperBeanM149;
    @EJB
    private HelperBeanN149 helperBeanN149;
    @EJB
    private HelperBeanO149 helperBeanO149;

    @EJB
    private StartupBean149 startupBean149;

    public String whoAmI() {
        return "i'm ExampleService149 "
        + helperBeanA149.identify()
        + helperBeanB149.identify()
        + helperBeanC149.identify()
        + helperBeanD149.identify()
        + helperBeanE149.identify()
        + helperBeanF149.identify()
        + helperBeanG149.identify()
        + helperBeanH149.identify()
        + helperBeanI149.identify()
        + helperBeanJ149.identify()
        + helperBeanK149.identify()
        + helperBeanL149.identify()
        + helperBeanM149.identify()
        + helperBeanN149.identify()
        + helperBeanO149.identify();
    }

}
