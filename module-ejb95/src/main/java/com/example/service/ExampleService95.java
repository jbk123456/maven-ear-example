package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService95 {

    @EJB
    private HelperBeanA95 helperBeanA95;
    @EJB
    private HelperBeanB95 helperBeanB95;
    @EJB
    private HelperBeanC95 helperBeanC95;
    @EJB
    private HelperBeanD95 helperBeanD95;
    @EJB
    private HelperBeanE95 helperBeanE95;
    @EJB
    private HelperBeanF95 helperBeanF95;
    @EJB
    private HelperBeanG95 helperBeanG95;
    @EJB
    private HelperBeanH95 helperBeanH95;
    @EJB
    private HelperBeanI95 helperBeanI95;
    @EJB
    private HelperBeanJ95 helperBeanJ95;
    @EJB
    private HelperBeanK95 helperBeanK95;
    @EJB
    private HelperBeanL95 helperBeanL95;
    @EJB
    private HelperBeanM95 helperBeanM95;
    @EJB
    private HelperBeanN95 helperBeanN95;
    @EJB
    private HelperBeanO95 helperBeanO95;

    @EJB
    private StartupBean95 startupBean95;

    public String whoAmI() {
        return "i'm ExampleService95 "
        + helperBeanA95.identify()
        + helperBeanB95.identify()
        + helperBeanC95.identify()
        + helperBeanD95.identify()
        + helperBeanE95.identify()
        + helperBeanF95.identify()
        + helperBeanG95.identify()
        + helperBeanH95.identify()
        + helperBeanI95.identify()
        + helperBeanJ95.identify()
        + helperBeanK95.identify()
        + helperBeanL95.identify()
        + helperBeanM95.identify()
        + helperBeanN95.identify()
        + helperBeanO95.identify();
    }

}
