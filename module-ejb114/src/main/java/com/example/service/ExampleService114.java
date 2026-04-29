package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService114 {

    @EJB
    private HelperBeanA114 helperBeanA114;
    @EJB
    private HelperBeanB114 helperBeanB114;
    @EJB
    private HelperBeanC114 helperBeanC114;
    @EJB
    private HelperBeanD114 helperBeanD114;
    @EJB
    private HelperBeanE114 helperBeanE114;
    @EJB
    private HelperBeanF114 helperBeanF114;
    @EJB
    private HelperBeanG114 helperBeanG114;
    @EJB
    private HelperBeanH114 helperBeanH114;
    @EJB
    private HelperBeanI114 helperBeanI114;
    @EJB
    private HelperBeanJ114 helperBeanJ114;
    @EJB
    private HelperBeanK114 helperBeanK114;
    @EJB
    private HelperBeanL114 helperBeanL114;
    @EJB
    private HelperBeanM114 helperBeanM114;
    @EJB
    private HelperBeanN114 helperBeanN114;
    @EJB
    private HelperBeanO114 helperBeanO114;

    @EJB
    private StartupBean114 startupBean114;

    public String whoAmI() {
        return "i'm ExampleService114 "
        + helperBeanA114.identify()
        + helperBeanB114.identify()
        + helperBeanC114.identify()
        + helperBeanD114.identify()
        + helperBeanE114.identify()
        + helperBeanF114.identify()
        + helperBeanG114.identify()
        + helperBeanH114.identify()
        + helperBeanI114.identify()
        + helperBeanJ114.identify()
        + helperBeanK114.identify()
        + helperBeanL114.identify()
        + helperBeanM114.identify()
        + helperBeanN114.identify()
        + helperBeanO114.identify();
    }

}
