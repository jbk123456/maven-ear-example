package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService16 {

    @EJB
    private HelperBeanA16 helperBeanA16;
    @EJB
    private HelperBeanB16 helperBeanB16;
    @EJB
    private HelperBeanC16 helperBeanC16;
    @EJB
    private HelperBeanD16 helperBeanD16;
    @EJB
    private HelperBeanE16 helperBeanE16;
    @EJB
    private HelperBeanF16 helperBeanF16;
    @EJB
    private HelperBeanG16 helperBeanG16;
    @EJB
    private HelperBeanH16 helperBeanH16;
    @EJB
    private HelperBeanI16 helperBeanI16;
    @EJB
    private HelperBeanJ16 helperBeanJ16;
    @EJB
    private HelperBeanK16 helperBeanK16;
    @EJB
    private HelperBeanL16 helperBeanL16;
    @EJB
    private HelperBeanM16 helperBeanM16;
    @EJB
    private HelperBeanN16 helperBeanN16;
    @EJB
    private HelperBeanO16 helperBeanO16;

    @EJB
    private StartupBean16 startupBean16;

    public String whoAmI() {
        return "i'm ExampleService16 "
        + helperBeanA16.identify()
        + helperBeanB16.identify()
        + helperBeanC16.identify()
        + helperBeanD16.identify()
        + helperBeanE16.identify()
        + helperBeanF16.identify()
        + helperBeanG16.identify()
        + helperBeanH16.identify()
        + helperBeanI16.identify()
        + helperBeanJ16.identify()
        + helperBeanK16.identify()
        + helperBeanL16.identify()
        + helperBeanM16.identify()
        + helperBeanN16.identify()
        + helperBeanO16.identify();
    }

}
