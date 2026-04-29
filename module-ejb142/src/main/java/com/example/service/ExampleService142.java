package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService142 {

    @EJB
    private HelperBeanA142 helperBeanA142;
    @EJB
    private HelperBeanB142 helperBeanB142;
    @EJB
    private HelperBeanC142 helperBeanC142;
    @EJB
    private HelperBeanD142 helperBeanD142;
    @EJB
    private HelperBeanE142 helperBeanE142;
    @EJB
    private HelperBeanF142 helperBeanF142;
    @EJB
    private HelperBeanG142 helperBeanG142;
    @EJB
    private HelperBeanH142 helperBeanH142;
    @EJB
    private HelperBeanI142 helperBeanI142;
    @EJB
    private HelperBeanJ142 helperBeanJ142;
    @EJB
    private HelperBeanK142 helperBeanK142;
    @EJB
    private HelperBeanL142 helperBeanL142;
    @EJB
    private HelperBeanM142 helperBeanM142;
    @EJB
    private HelperBeanN142 helperBeanN142;
    @EJB
    private HelperBeanO142 helperBeanO142;

    @EJB
    private StartupBean142 startupBean142;

    public String whoAmI() {
        return "i'm ExampleService142 "
        + helperBeanA142.identify()
        + helperBeanB142.identify()
        + helperBeanC142.identify()
        + helperBeanD142.identify()
        + helperBeanE142.identify()
        + helperBeanF142.identify()
        + helperBeanG142.identify()
        + helperBeanH142.identify()
        + helperBeanI142.identify()
        + helperBeanJ142.identify()
        + helperBeanK142.identify()
        + helperBeanL142.identify()
        + helperBeanM142.identify()
        + helperBeanN142.identify()
        + helperBeanO142.identify();
    }

}
