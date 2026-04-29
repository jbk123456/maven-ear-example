package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService140 {

    @EJB
    private HelperBeanA140 helperBeanA140;
    @EJB
    private HelperBeanB140 helperBeanB140;
    @EJB
    private HelperBeanC140 helperBeanC140;
    @EJB
    private HelperBeanD140 helperBeanD140;
    @EJB
    private HelperBeanE140 helperBeanE140;
    @EJB
    private HelperBeanF140 helperBeanF140;
    @EJB
    private HelperBeanG140 helperBeanG140;
    @EJB
    private HelperBeanH140 helperBeanH140;
    @EJB
    private HelperBeanI140 helperBeanI140;
    @EJB
    private HelperBeanJ140 helperBeanJ140;
    @EJB
    private HelperBeanK140 helperBeanK140;
    @EJB
    private HelperBeanL140 helperBeanL140;
    @EJB
    private HelperBeanM140 helperBeanM140;
    @EJB
    private HelperBeanN140 helperBeanN140;
    @EJB
    private HelperBeanO140 helperBeanO140;

    @EJB
    private StartupBean140 startupBean140;

    public String whoAmI() {
        return "i'm ExampleService140 "
        + helperBeanA140.identify()
        + helperBeanB140.identify()
        + helperBeanC140.identify()
        + helperBeanD140.identify()
        + helperBeanE140.identify()
        + helperBeanF140.identify()
        + helperBeanG140.identify()
        + helperBeanH140.identify()
        + helperBeanI140.identify()
        + helperBeanJ140.identify()
        + helperBeanK140.identify()
        + helperBeanL140.identify()
        + helperBeanM140.identify()
        + helperBeanN140.identify()
        + helperBeanO140.identify();
    }

}
