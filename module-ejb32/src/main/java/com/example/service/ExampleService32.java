package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService32 {

    @EJB
    private HelperBeanA32 helperBeanA32;
    @EJB
    private HelperBeanB32 helperBeanB32;
    @EJB
    private HelperBeanC32 helperBeanC32;
    @EJB
    private HelperBeanD32 helperBeanD32;
    @EJB
    private HelperBeanE32 helperBeanE32;
    @EJB
    private HelperBeanF32 helperBeanF32;
    @EJB
    private HelperBeanG32 helperBeanG32;
    @EJB
    private HelperBeanH32 helperBeanH32;
    @EJB
    private HelperBeanI32 helperBeanI32;
    @EJB
    private HelperBeanJ32 helperBeanJ32;
    @EJB
    private HelperBeanK32 helperBeanK32;
    @EJB
    private HelperBeanL32 helperBeanL32;
    @EJB
    private HelperBeanM32 helperBeanM32;
    @EJB
    private HelperBeanN32 helperBeanN32;
    @EJB
    private HelperBeanO32 helperBeanO32;

    @EJB
    private StartupBean32 startupBean32;

    public String whoAmI() {
        return "i'm ExampleService32 "
        + helperBeanA32.identify()
        + helperBeanB32.identify()
        + helperBeanC32.identify()
        + helperBeanD32.identify()
        + helperBeanE32.identify()
        + helperBeanF32.identify()
        + helperBeanG32.identify()
        + helperBeanH32.identify()
        + helperBeanI32.identify()
        + helperBeanJ32.identify()
        + helperBeanK32.identify()
        + helperBeanL32.identify()
        + helperBeanM32.identify()
        + helperBeanN32.identify()
        + helperBeanO32.identify();
    }

}
