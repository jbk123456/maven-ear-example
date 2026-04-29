package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService21 {

    @EJB
    private HelperBeanA21 helperBeanA21;
    @EJB
    private HelperBeanB21 helperBeanB21;
    @EJB
    private HelperBeanC21 helperBeanC21;
    @EJB
    private HelperBeanD21 helperBeanD21;
    @EJB
    private HelperBeanE21 helperBeanE21;
    @EJB
    private HelperBeanF21 helperBeanF21;
    @EJB
    private HelperBeanG21 helperBeanG21;
    @EJB
    private HelperBeanH21 helperBeanH21;
    @EJB
    private HelperBeanI21 helperBeanI21;
    @EJB
    private HelperBeanJ21 helperBeanJ21;
    @EJB
    private HelperBeanK21 helperBeanK21;
    @EJB
    private HelperBeanL21 helperBeanL21;
    @EJB
    private HelperBeanM21 helperBeanM21;
    @EJB
    private HelperBeanN21 helperBeanN21;
    @EJB
    private HelperBeanO21 helperBeanO21;

    @EJB
    private StartupBean21 startupBean21;

    public String whoAmI() {
        return "i'm ExampleService21 "
        + helperBeanA21.identify()
        + helperBeanB21.identify()
        + helperBeanC21.identify()
        + helperBeanD21.identify()
        + helperBeanE21.identify()
        + helperBeanF21.identify()
        + helperBeanG21.identify()
        + helperBeanH21.identify()
        + helperBeanI21.identify()
        + helperBeanJ21.identify()
        + helperBeanK21.identify()
        + helperBeanL21.identify()
        + helperBeanM21.identify()
        + helperBeanN21.identify()
        + helperBeanO21.identify();
    }

}
