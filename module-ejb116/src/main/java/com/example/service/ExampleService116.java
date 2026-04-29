package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService116 {

    @EJB
    private HelperBeanA116 helperBeanA116;
    @EJB
    private HelperBeanB116 helperBeanB116;
    @EJB
    private HelperBeanC116 helperBeanC116;
    @EJB
    private HelperBeanD116 helperBeanD116;
    @EJB
    private HelperBeanE116 helperBeanE116;
    @EJB
    private HelperBeanF116 helperBeanF116;
    @EJB
    private HelperBeanG116 helperBeanG116;
    @EJB
    private HelperBeanH116 helperBeanH116;
    @EJB
    private HelperBeanI116 helperBeanI116;
    @EJB
    private HelperBeanJ116 helperBeanJ116;
    @EJB
    private HelperBeanK116 helperBeanK116;
    @EJB
    private HelperBeanL116 helperBeanL116;
    @EJB
    private HelperBeanM116 helperBeanM116;
    @EJB
    private HelperBeanN116 helperBeanN116;
    @EJB
    private HelperBeanO116 helperBeanO116;

    @EJB
    private StartupBean116 startupBean116;

    public String whoAmI() {
        return "i'm ExampleService116 "
        + helperBeanA116.identify()
        + helperBeanB116.identify()
        + helperBeanC116.identify()
        + helperBeanD116.identify()
        + helperBeanE116.identify()
        + helperBeanF116.identify()
        + helperBeanG116.identify()
        + helperBeanH116.identify()
        + helperBeanI116.identify()
        + helperBeanJ116.identify()
        + helperBeanK116.identify()
        + helperBeanL116.identify()
        + helperBeanM116.identify()
        + helperBeanN116.identify()
        + helperBeanO116.identify();
    }

}
