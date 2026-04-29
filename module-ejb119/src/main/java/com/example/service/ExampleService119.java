package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService119 {

    @EJB
    private HelperBeanA119 helperBeanA119;
    @EJB
    private HelperBeanB119 helperBeanB119;
    @EJB
    private HelperBeanC119 helperBeanC119;
    @EJB
    private HelperBeanD119 helperBeanD119;
    @EJB
    private HelperBeanE119 helperBeanE119;
    @EJB
    private HelperBeanF119 helperBeanF119;
    @EJB
    private HelperBeanG119 helperBeanG119;
    @EJB
    private HelperBeanH119 helperBeanH119;
    @EJB
    private HelperBeanI119 helperBeanI119;
    @EJB
    private HelperBeanJ119 helperBeanJ119;
    @EJB
    private HelperBeanK119 helperBeanK119;
    @EJB
    private HelperBeanL119 helperBeanL119;
    @EJB
    private HelperBeanM119 helperBeanM119;
    @EJB
    private HelperBeanN119 helperBeanN119;
    @EJB
    private HelperBeanO119 helperBeanO119;

    @EJB
    private StartupBean119 startupBean119;

    public String whoAmI() {
        return "i'm ExampleService119 "
        + helperBeanA119.identify()
        + helperBeanB119.identify()
        + helperBeanC119.identify()
        + helperBeanD119.identify()
        + helperBeanE119.identify()
        + helperBeanF119.identify()
        + helperBeanG119.identify()
        + helperBeanH119.identify()
        + helperBeanI119.identify()
        + helperBeanJ119.identify()
        + helperBeanK119.identify()
        + helperBeanL119.identify()
        + helperBeanM119.identify()
        + helperBeanN119.identify()
        + helperBeanO119.identify();
    }

}
