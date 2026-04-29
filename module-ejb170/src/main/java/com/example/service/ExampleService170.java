package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService170 {

    @EJB
    private HelperBeanA170 helperBeanA170;
    @EJB
    private HelperBeanB170 helperBeanB170;
    @EJB
    private HelperBeanC170 helperBeanC170;
    @EJB
    private HelperBeanD170 helperBeanD170;
    @EJB
    private HelperBeanE170 helperBeanE170;
    @EJB
    private HelperBeanF170 helperBeanF170;
    @EJB
    private HelperBeanG170 helperBeanG170;
    @EJB
    private HelperBeanH170 helperBeanH170;
    @EJB
    private HelperBeanI170 helperBeanI170;
    @EJB
    private HelperBeanJ170 helperBeanJ170;
    @EJB
    private HelperBeanK170 helperBeanK170;
    @EJB
    private HelperBeanL170 helperBeanL170;
    @EJB
    private HelperBeanM170 helperBeanM170;
    @EJB
    private HelperBeanN170 helperBeanN170;
    @EJB
    private HelperBeanO170 helperBeanO170;

    @EJB
    private StartupBean170 startupBean170;

    public String whoAmI() {
        return "i'm ExampleService170 "
        + helperBeanA170.identify()
        + helperBeanB170.identify()
        + helperBeanC170.identify()
        + helperBeanD170.identify()
        + helperBeanE170.identify()
        + helperBeanF170.identify()
        + helperBeanG170.identify()
        + helperBeanH170.identify()
        + helperBeanI170.identify()
        + helperBeanJ170.identify()
        + helperBeanK170.identify()
        + helperBeanL170.identify()
        + helperBeanM170.identify()
        + helperBeanN170.identify()
        + helperBeanO170.identify();
    }

}
