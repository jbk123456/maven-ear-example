package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService65 {

    @EJB
    private HelperBeanA65 helperBeanA65;
    @EJB
    private HelperBeanB65 helperBeanB65;
    @EJB
    private HelperBeanC65 helperBeanC65;
    @EJB
    private HelperBeanD65 helperBeanD65;
    @EJB
    private HelperBeanE65 helperBeanE65;
    @EJB
    private HelperBeanF65 helperBeanF65;
    @EJB
    private HelperBeanG65 helperBeanG65;
    @EJB
    private HelperBeanH65 helperBeanH65;
    @EJB
    private HelperBeanI65 helperBeanI65;
    @EJB
    private HelperBeanJ65 helperBeanJ65;
    @EJB
    private HelperBeanK65 helperBeanK65;
    @EJB
    private HelperBeanL65 helperBeanL65;
    @EJB
    private HelperBeanM65 helperBeanM65;
    @EJB
    private HelperBeanN65 helperBeanN65;
    @EJB
    private HelperBeanO65 helperBeanO65;

    @EJB
    private StartupBean65 startupBean65;

    public String whoAmI() {
        return "i'm ExampleService65 "
        + helperBeanA65.identify()
        + helperBeanB65.identify()
        + helperBeanC65.identify()
        + helperBeanD65.identify()
        + helperBeanE65.identify()
        + helperBeanF65.identify()
        + helperBeanG65.identify()
        + helperBeanH65.identify()
        + helperBeanI65.identify()
        + helperBeanJ65.identify()
        + helperBeanK65.identify()
        + helperBeanL65.identify()
        + helperBeanM65.identify()
        + helperBeanN65.identify()
        + helperBeanO65.identify();
    }

}
