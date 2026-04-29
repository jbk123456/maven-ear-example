package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService89 {

    @EJB
    private HelperBeanA89 helperBeanA89;
    @EJB
    private HelperBeanB89 helperBeanB89;
    @EJB
    private HelperBeanC89 helperBeanC89;
    @EJB
    private HelperBeanD89 helperBeanD89;
    @EJB
    private HelperBeanE89 helperBeanE89;
    @EJB
    private HelperBeanF89 helperBeanF89;
    @EJB
    private HelperBeanG89 helperBeanG89;
    @EJB
    private HelperBeanH89 helperBeanH89;
    @EJB
    private HelperBeanI89 helperBeanI89;
    @EJB
    private HelperBeanJ89 helperBeanJ89;
    @EJB
    private HelperBeanK89 helperBeanK89;
    @EJB
    private HelperBeanL89 helperBeanL89;
    @EJB
    private HelperBeanM89 helperBeanM89;
    @EJB
    private HelperBeanN89 helperBeanN89;
    @EJB
    private HelperBeanO89 helperBeanO89;

    @EJB
    private StartupBean89 startupBean89;

    public String whoAmI() {
        return "i'm ExampleService89 "
        + helperBeanA89.identify()
        + helperBeanB89.identify()
        + helperBeanC89.identify()
        + helperBeanD89.identify()
        + helperBeanE89.identify()
        + helperBeanF89.identify()
        + helperBeanG89.identify()
        + helperBeanH89.identify()
        + helperBeanI89.identify()
        + helperBeanJ89.identify()
        + helperBeanK89.identify()
        + helperBeanL89.identify()
        + helperBeanM89.identify()
        + helperBeanN89.identify()
        + helperBeanO89.identify();
    }

}
