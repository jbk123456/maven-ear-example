package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService102 {

    @EJB
    private HelperBeanA102 helperBeanA102;
    @EJB
    private HelperBeanB102 helperBeanB102;
    @EJB
    private HelperBeanC102 helperBeanC102;
    @EJB
    private HelperBeanD102 helperBeanD102;
    @EJB
    private HelperBeanE102 helperBeanE102;
    @EJB
    private HelperBeanF102 helperBeanF102;
    @EJB
    private HelperBeanG102 helperBeanG102;
    @EJB
    private HelperBeanH102 helperBeanH102;
    @EJB
    private HelperBeanI102 helperBeanI102;
    @EJB
    private HelperBeanJ102 helperBeanJ102;
    @EJB
    private HelperBeanK102 helperBeanK102;
    @EJB
    private HelperBeanL102 helperBeanL102;
    @EJB
    private HelperBeanM102 helperBeanM102;
    @EJB
    private HelperBeanN102 helperBeanN102;
    @EJB
    private HelperBeanO102 helperBeanO102;

    @EJB
    private StartupBean102 startupBean102;

    public String whoAmI() {
        return "i'm ExampleService102 "
        + helperBeanA102.identify()
        + helperBeanB102.identify()
        + helperBeanC102.identify()
        + helperBeanD102.identify()
        + helperBeanE102.identify()
        + helperBeanF102.identify()
        + helperBeanG102.identify()
        + helperBeanH102.identify()
        + helperBeanI102.identify()
        + helperBeanJ102.identify()
        + helperBeanK102.identify()
        + helperBeanL102.identify()
        + helperBeanM102.identify()
        + helperBeanN102.identify()
        + helperBeanO102.identify();
    }

}
