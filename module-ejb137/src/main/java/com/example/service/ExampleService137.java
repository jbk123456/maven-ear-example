package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService137 {

    @EJB
    private HelperBeanA137 helperBeanA137;
    @EJB
    private HelperBeanB137 helperBeanB137;
    @EJB
    private HelperBeanC137 helperBeanC137;
    @EJB
    private HelperBeanD137 helperBeanD137;
    @EJB
    private HelperBeanE137 helperBeanE137;
    @EJB
    private HelperBeanF137 helperBeanF137;
    @EJB
    private HelperBeanG137 helperBeanG137;
    @EJB
    private HelperBeanH137 helperBeanH137;
    @EJB
    private HelperBeanI137 helperBeanI137;
    @EJB
    private HelperBeanJ137 helperBeanJ137;
    @EJB
    private HelperBeanK137 helperBeanK137;
    @EJB
    private HelperBeanL137 helperBeanL137;
    @EJB
    private HelperBeanM137 helperBeanM137;
    @EJB
    private HelperBeanN137 helperBeanN137;
    @EJB
    private HelperBeanO137 helperBeanO137;

    @EJB
    private StartupBean137 startupBean137;

    public String whoAmI() {
        return "i'm ExampleService137 "
        + helperBeanA137.identify()
        + helperBeanB137.identify()
        + helperBeanC137.identify()
        + helperBeanD137.identify()
        + helperBeanE137.identify()
        + helperBeanF137.identify()
        + helperBeanG137.identify()
        + helperBeanH137.identify()
        + helperBeanI137.identify()
        + helperBeanJ137.identify()
        + helperBeanK137.identify()
        + helperBeanL137.identify()
        + helperBeanM137.identify()
        + helperBeanN137.identify()
        + helperBeanO137.identify();
    }

}
