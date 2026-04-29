package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService125 {

    @EJB
    private HelperBeanA125 helperBeanA125;
    @EJB
    private HelperBeanB125 helperBeanB125;
    @EJB
    private HelperBeanC125 helperBeanC125;
    @EJB
    private HelperBeanD125 helperBeanD125;
    @EJB
    private HelperBeanE125 helperBeanE125;
    @EJB
    private HelperBeanF125 helperBeanF125;
    @EJB
    private HelperBeanG125 helperBeanG125;
    @EJB
    private HelperBeanH125 helperBeanH125;
    @EJB
    private HelperBeanI125 helperBeanI125;
    @EJB
    private HelperBeanJ125 helperBeanJ125;
    @EJB
    private HelperBeanK125 helperBeanK125;
    @EJB
    private HelperBeanL125 helperBeanL125;
    @EJB
    private HelperBeanM125 helperBeanM125;
    @EJB
    private HelperBeanN125 helperBeanN125;
    @EJB
    private HelperBeanO125 helperBeanO125;

    @EJB
    private StartupBean125 startupBean125;

    public String whoAmI() {
        return "i'm ExampleService125 "
        + helperBeanA125.identify()
        + helperBeanB125.identify()
        + helperBeanC125.identify()
        + helperBeanD125.identify()
        + helperBeanE125.identify()
        + helperBeanF125.identify()
        + helperBeanG125.identify()
        + helperBeanH125.identify()
        + helperBeanI125.identify()
        + helperBeanJ125.identify()
        + helperBeanK125.identify()
        + helperBeanL125.identify()
        + helperBeanM125.identify()
        + helperBeanN125.identify()
        + helperBeanO125.identify();
    }

}
