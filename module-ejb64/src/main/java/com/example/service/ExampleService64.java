package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService64 {

    @EJB
    private HelperBeanA64 helperBeanA64;
    @EJB
    private HelperBeanB64 helperBeanB64;
    @EJB
    private HelperBeanC64 helperBeanC64;
    @EJB
    private HelperBeanD64 helperBeanD64;
    @EJB
    private HelperBeanE64 helperBeanE64;
    @EJB
    private HelperBeanF64 helperBeanF64;
    @EJB
    private HelperBeanG64 helperBeanG64;
    @EJB
    private HelperBeanH64 helperBeanH64;
    @EJB
    private HelperBeanI64 helperBeanI64;
    @EJB
    private HelperBeanJ64 helperBeanJ64;
    @EJB
    private HelperBeanK64 helperBeanK64;
    @EJB
    private HelperBeanL64 helperBeanL64;
    @EJB
    private HelperBeanM64 helperBeanM64;
    @EJB
    private HelperBeanN64 helperBeanN64;
    @EJB
    private HelperBeanO64 helperBeanO64;

    @EJB
    private StartupBean64 startupBean64;

    public String whoAmI() {
        return "i'm ExampleService64 "
        + helperBeanA64.identify()
        + helperBeanB64.identify()
        + helperBeanC64.identify()
        + helperBeanD64.identify()
        + helperBeanE64.identify()
        + helperBeanF64.identify()
        + helperBeanG64.identify()
        + helperBeanH64.identify()
        + helperBeanI64.identify()
        + helperBeanJ64.identify()
        + helperBeanK64.identify()
        + helperBeanL64.identify()
        + helperBeanM64.identify()
        + helperBeanN64.identify()
        + helperBeanO64.identify();
    }

}
