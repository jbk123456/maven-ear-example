package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService94 {

    @EJB
    private HelperBeanA94 helperBeanA94;
    @EJB
    private HelperBeanB94 helperBeanB94;
    @EJB
    private HelperBeanC94 helperBeanC94;
    @EJB
    private HelperBeanD94 helperBeanD94;
    @EJB
    private HelperBeanE94 helperBeanE94;
    @EJB
    private HelperBeanF94 helperBeanF94;
    @EJB
    private HelperBeanG94 helperBeanG94;
    @EJB
    private HelperBeanH94 helperBeanH94;
    @EJB
    private HelperBeanI94 helperBeanI94;
    @EJB
    private HelperBeanJ94 helperBeanJ94;
    @EJB
    private HelperBeanK94 helperBeanK94;
    @EJB
    private HelperBeanL94 helperBeanL94;
    @EJB
    private HelperBeanM94 helperBeanM94;
    @EJB
    private HelperBeanN94 helperBeanN94;
    @EJB
    private HelperBeanO94 helperBeanO94;

    @EJB
    private StartupBean94 startupBean94;

    public String whoAmI() {
        return "i'm ExampleService94 "
        + helperBeanA94.identify()
        + helperBeanB94.identify()
        + helperBeanC94.identify()
        + helperBeanD94.identify()
        + helperBeanE94.identify()
        + helperBeanF94.identify()
        + helperBeanG94.identify()
        + helperBeanH94.identify()
        + helperBeanI94.identify()
        + helperBeanJ94.identify()
        + helperBeanK94.identify()
        + helperBeanL94.identify()
        + helperBeanM94.identify()
        + helperBeanN94.identify()
        + helperBeanO94.identify();
    }

}
