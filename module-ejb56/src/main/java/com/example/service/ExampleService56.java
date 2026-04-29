package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService56 {

    @EJB
    private HelperBeanA56 helperBeanA56;
    @EJB
    private HelperBeanB56 helperBeanB56;
    @EJB
    private HelperBeanC56 helperBeanC56;
    @EJB
    private HelperBeanD56 helperBeanD56;
    @EJB
    private HelperBeanE56 helperBeanE56;
    @EJB
    private HelperBeanF56 helperBeanF56;
    @EJB
    private HelperBeanG56 helperBeanG56;
    @EJB
    private HelperBeanH56 helperBeanH56;
    @EJB
    private HelperBeanI56 helperBeanI56;
    @EJB
    private HelperBeanJ56 helperBeanJ56;
    @EJB
    private HelperBeanK56 helperBeanK56;
    @EJB
    private HelperBeanL56 helperBeanL56;
    @EJB
    private HelperBeanM56 helperBeanM56;
    @EJB
    private HelperBeanN56 helperBeanN56;
    @EJB
    private HelperBeanO56 helperBeanO56;

    @EJB
    private StartupBean56 startupBean56;

    public String whoAmI() {
        return "i'm ExampleService56 "
        + helperBeanA56.identify()
        + helperBeanB56.identify()
        + helperBeanC56.identify()
        + helperBeanD56.identify()
        + helperBeanE56.identify()
        + helperBeanF56.identify()
        + helperBeanG56.identify()
        + helperBeanH56.identify()
        + helperBeanI56.identify()
        + helperBeanJ56.identify()
        + helperBeanK56.identify()
        + helperBeanL56.identify()
        + helperBeanM56.identify()
        + helperBeanN56.identify()
        + helperBeanO56.identify();
    }

}
