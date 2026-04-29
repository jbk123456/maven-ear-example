package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService103 {

    @EJB
    private HelperBeanA103 helperBeanA103;
    @EJB
    private HelperBeanB103 helperBeanB103;
    @EJB
    private HelperBeanC103 helperBeanC103;
    @EJB
    private HelperBeanD103 helperBeanD103;
    @EJB
    private HelperBeanE103 helperBeanE103;
    @EJB
    private HelperBeanF103 helperBeanF103;
    @EJB
    private HelperBeanG103 helperBeanG103;
    @EJB
    private HelperBeanH103 helperBeanH103;
    @EJB
    private HelperBeanI103 helperBeanI103;
    @EJB
    private HelperBeanJ103 helperBeanJ103;
    @EJB
    private HelperBeanK103 helperBeanK103;
    @EJB
    private HelperBeanL103 helperBeanL103;
    @EJB
    private HelperBeanM103 helperBeanM103;
    @EJB
    private HelperBeanN103 helperBeanN103;
    @EJB
    private HelperBeanO103 helperBeanO103;

    @EJB
    private StartupBean103 startupBean103;

    public String whoAmI() {
        return "i'm ExampleService103 "
        + helperBeanA103.identify()
        + helperBeanB103.identify()
        + helperBeanC103.identify()
        + helperBeanD103.identify()
        + helperBeanE103.identify()
        + helperBeanF103.identify()
        + helperBeanG103.identify()
        + helperBeanH103.identify()
        + helperBeanI103.identify()
        + helperBeanJ103.identify()
        + helperBeanK103.identify()
        + helperBeanL103.identify()
        + helperBeanM103.identify()
        + helperBeanN103.identify()
        + helperBeanO103.identify();
    }

}
