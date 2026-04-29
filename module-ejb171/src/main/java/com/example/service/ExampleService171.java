package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService171 {

    @EJB
    private HelperBeanA171 helperBeanA171;
    @EJB
    private HelperBeanB171 helperBeanB171;
    @EJB
    private HelperBeanC171 helperBeanC171;
    @EJB
    private HelperBeanD171 helperBeanD171;
    @EJB
    private HelperBeanE171 helperBeanE171;
    @EJB
    private HelperBeanF171 helperBeanF171;
    @EJB
    private HelperBeanG171 helperBeanG171;
    @EJB
    private HelperBeanH171 helperBeanH171;
    @EJB
    private HelperBeanI171 helperBeanI171;
    @EJB
    private HelperBeanJ171 helperBeanJ171;
    @EJB
    private HelperBeanK171 helperBeanK171;
    @EJB
    private HelperBeanL171 helperBeanL171;
    @EJB
    private HelperBeanM171 helperBeanM171;
    @EJB
    private HelperBeanN171 helperBeanN171;
    @EJB
    private HelperBeanO171 helperBeanO171;

    @EJB
    private StartupBean171 startupBean171;

    public String whoAmI() {
        return "i'm ExampleService171 "
        + helperBeanA171.identify()
        + helperBeanB171.identify()
        + helperBeanC171.identify()
        + helperBeanD171.identify()
        + helperBeanE171.identify()
        + helperBeanF171.identify()
        + helperBeanG171.identify()
        + helperBeanH171.identify()
        + helperBeanI171.identify()
        + helperBeanJ171.identify()
        + helperBeanK171.identify()
        + helperBeanL171.identify()
        + helperBeanM171.identify()
        + helperBeanN171.identify()
        + helperBeanO171.identify();
    }

}
