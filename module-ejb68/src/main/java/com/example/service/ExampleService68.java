package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService68 {

    @EJB
    private HelperBeanA68 helperBeanA68;
    @EJB
    private HelperBeanB68 helperBeanB68;
    @EJB
    private HelperBeanC68 helperBeanC68;
    @EJB
    private HelperBeanD68 helperBeanD68;
    @EJB
    private HelperBeanE68 helperBeanE68;
    @EJB
    private HelperBeanF68 helperBeanF68;
    @EJB
    private HelperBeanG68 helperBeanG68;
    @EJB
    private HelperBeanH68 helperBeanH68;
    @EJB
    private HelperBeanI68 helperBeanI68;
    @EJB
    private HelperBeanJ68 helperBeanJ68;
    @EJB
    private HelperBeanK68 helperBeanK68;
    @EJB
    private HelperBeanL68 helperBeanL68;
    @EJB
    private HelperBeanM68 helperBeanM68;
    @EJB
    private HelperBeanN68 helperBeanN68;
    @EJB
    private HelperBeanO68 helperBeanO68;

    @EJB
    private StartupBean68 startupBean68;

    public String whoAmI() {
        return "i'm ExampleService68 "
        + helperBeanA68.identify()
        + helperBeanB68.identify()
        + helperBeanC68.identify()
        + helperBeanD68.identify()
        + helperBeanE68.identify()
        + helperBeanF68.identify()
        + helperBeanG68.identify()
        + helperBeanH68.identify()
        + helperBeanI68.identify()
        + helperBeanJ68.identify()
        + helperBeanK68.identify()
        + helperBeanL68.identify()
        + helperBeanM68.identify()
        + helperBeanN68.identify()
        + helperBeanO68.identify();
    }

}
