package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService33 {

    @EJB
    private HelperBeanA33 helperBeanA33;
    @EJB
    private HelperBeanB33 helperBeanB33;
    @EJB
    private HelperBeanC33 helperBeanC33;
    @EJB
    private HelperBeanD33 helperBeanD33;
    @EJB
    private HelperBeanE33 helperBeanE33;
    @EJB
    private HelperBeanF33 helperBeanF33;
    @EJB
    private HelperBeanG33 helperBeanG33;
    @EJB
    private HelperBeanH33 helperBeanH33;
    @EJB
    private HelperBeanI33 helperBeanI33;
    @EJB
    private HelperBeanJ33 helperBeanJ33;
    @EJB
    private HelperBeanK33 helperBeanK33;
    @EJB
    private HelperBeanL33 helperBeanL33;
    @EJB
    private HelperBeanM33 helperBeanM33;
    @EJB
    private HelperBeanN33 helperBeanN33;
    @EJB
    private HelperBeanO33 helperBeanO33;

    @EJB
    private StartupBean33 startupBean33;

    public String whoAmI() {
        return "i'm ExampleService33 "
        + helperBeanA33.identify()
        + helperBeanB33.identify()
        + helperBeanC33.identify()
        + helperBeanD33.identify()
        + helperBeanE33.identify()
        + helperBeanF33.identify()
        + helperBeanG33.identify()
        + helperBeanH33.identify()
        + helperBeanI33.identify()
        + helperBeanJ33.identify()
        + helperBeanK33.identify()
        + helperBeanL33.identify()
        + helperBeanM33.identify()
        + helperBeanN33.identify()
        + helperBeanO33.identify();
    }

}
