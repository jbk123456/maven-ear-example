package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService54 {

    @EJB
    private HelperBeanA54 helperBeanA54;
    @EJB
    private HelperBeanB54 helperBeanB54;
    @EJB
    private HelperBeanC54 helperBeanC54;
    @EJB
    private HelperBeanD54 helperBeanD54;
    @EJB
    private HelperBeanE54 helperBeanE54;
    @EJB
    private HelperBeanF54 helperBeanF54;
    @EJB
    private HelperBeanG54 helperBeanG54;
    @EJB
    private HelperBeanH54 helperBeanH54;
    @EJB
    private HelperBeanI54 helperBeanI54;
    @EJB
    private HelperBeanJ54 helperBeanJ54;
    @EJB
    private HelperBeanK54 helperBeanK54;
    @EJB
    private HelperBeanL54 helperBeanL54;
    @EJB
    private HelperBeanM54 helperBeanM54;
    @EJB
    private HelperBeanN54 helperBeanN54;
    @EJB
    private HelperBeanO54 helperBeanO54;

    @EJB
    private StartupBean54 startupBean54;

    public String whoAmI() {
        return "i'm ExampleService54 "
        + helperBeanA54.identify()
        + helperBeanB54.identify()
        + helperBeanC54.identify()
        + helperBeanD54.identify()
        + helperBeanE54.identify()
        + helperBeanF54.identify()
        + helperBeanG54.identify()
        + helperBeanH54.identify()
        + helperBeanI54.identify()
        + helperBeanJ54.identify()
        + helperBeanK54.identify()
        + helperBeanL54.identify()
        + helperBeanM54.identify()
        + helperBeanN54.identify()
        + helperBeanO54.identify();
    }

}
