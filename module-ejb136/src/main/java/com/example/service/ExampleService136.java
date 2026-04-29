package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService136 {

    @EJB
    private HelperBeanA136 helperBeanA136;
    @EJB
    private HelperBeanB136 helperBeanB136;
    @EJB
    private HelperBeanC136 helperBeanC136;
    @EJB
    private HelperBeanD136 helperBeanD136;
    @EJB
    private HelperBeanE136 helperBeanE136;
    @EJB
    private HelperBeanF136 helperBeanF136;
    @EJB
    private HelperBeanG136 helperBeanG136;
    @EJB
    private HelperBeanH136 helperBeanH136;
    @EJB
    private HelperBeanI136 helperBeanI136;
    @EJB
    private HelperBeanJ136 helperBeanJ136;
    @EJB
    private HelperBeanK136 helperBeanK136;
    @EJB
    private HelperBeanL136 helperBeanL136;
    @EJB
    private HelperBeanM136 helperBeanM136;
    @EJB
    private HelperBeanN136 helperBeanN136;
    @EJB
    private HelperBeanO136 helperBeanO136;

    @EJB
    private StartupBean136 startupBean136;

    public String whoAmI() {
        return "i'm ExampleService136 "
        + helperBeanA136.identify()
        + helperBeanB136.identify()
        + helperBeanC136.identify()
        + helperBeanD136.identify()
        + helperBeanE136.identify()
        + helperBeanF136.identify()
        + helperBeanG136.identify()
        + helperBeanH136.identify()
        + helperBeanI136.identify()
        + helperBeanJ136.identify()
        + helperBeanK136.identify()
        + helperBeanL136.identify()
        + helperBeanM136.identify()
        + helperBeanN136.identify()
        + helperBeanO136.identify();
    }

}
