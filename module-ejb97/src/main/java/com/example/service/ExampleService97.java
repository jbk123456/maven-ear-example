package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService97 {

    @EJB
    private HelperBeanA97 helperBeanA97;
    @EJB
    private HelperBeanB97 helperBeanB97;
    @EJB
    private HelperBeanC97 helperBeanC97;
    @EJB
    private HelperBeanD97 helperBeanD97;
    @EJB
    private HelperBeanE97 helperBeanE97;
    @EJB
    private HelperBeanF97 helperBeanF97;
    @EJB
    private HelperBeanG97 helperBeanG97;
    @EJB
    private HelperBeanH97 helperBeanH97;
    @EJB
    private HelperBeanI97 helperBeanI97;
    @EJB
    private HelperBeanJ97 helperBeanJ97;
    @EJB
    private HelperBeanK97 helperBeanK97;
    @EJB
    private HelperBeanL97 helperBeanL97;
    @EJB
    private HelperBeanM97 helperBeanM97;
    @EJB
    private HelperBeanN97 helperBeanN97;
    @EJB
    private HelperBeanO97 helperBeanO97;

    @EJB
    private StartupBean97 startupBean97;

    public String whoAmI() {
        return "i'm ExampleService97 "
        + helperBeanA97.identify()
        + helperBeanB97.identify()
        + helperBeanC97.identify()
        + helperBeanD97.identify()
        + helperBeanE97.identify()
        + helperBeanF97.identify()
        + helperBeanG97.identify()
        + helperBeanH97.identify()
        + helperBeanI97.identify()
        + helperBeanJ97.identify()
        + helperBeanK97.identify()
        + helperBeanL97.identify()
        + helperBeanM97.identify()
        + helperBeanN97.identify()
        + helperBeanO97.identify();
    }

}
