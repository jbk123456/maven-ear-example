package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService47 {

    @EJB
    private HelperBeanA47 helperBeanA47;
    @EJB
    private HelperBeanB47 helperBeanB47;
    @EJB
    private HelperBeanC47 helperBeanC47;
    @EJB
    private HelperBeanD47 helperBeanD47;
    @EJB
    private HelperBeanE47 helperBeanE47;
    @EJB
    private HelperBeanF47 helperBeanF47;
    @EJB
    private HelperBeanG47 helperBeanG47;
    @EJB
    private HelperBeanH47 helperBeanH47;
    @EJB
    private HelperBeanI47 helperBeanI47;
    @EJB
    private HelperBeanJ47 helperBeanJ47;
    @EJB
    private HelperBeanK47 helperBeanK47;
    @EJB
    private HelperBeanL47 helperBeanL47;
    @EJB
    private HelperBeanM47 helperBeanM47;
    @EJB
    private HelperBeanN47 helperBeanN47;
    @EJB
    private HelperBeanO47 helperBeanO47;

    @EJB
    private StartupBean47 startupBean47;

    public String whoAmI() {
        return "i'm ExampleService47 "
        + helperBeanA47.identify()
        + helperBeanB47.identify()
        + helperBeanC47.identify()
        + helperBeanD47.identify()
        + helperBeanE47.identify()
        + helperBeanF47.identify()
        + helperBeanG47.identify()
        + helperBeanH47.identify()
        + helperBeanI47.identify()
        + helperBeanJ47.identify()
        + helperBeanK47.identify()
        + helperBeanL47.identify()
        + helperBeanM47.identify()
        + helperBeanN47.identify()
        + helperBeanO47.identify();
    }

}
