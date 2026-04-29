package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService164 {

    @EJB
    private HelperBeanA164 helperBeanA164;
    @EJB
    private HelperBeanB164 helperBeanB164;
    @EJB
    private HelperBeanC164 helperBeanC164;
    @EJB
    private HelperBeanD164 helperBeanD164;
    @EJB
    private HelperBeanE164 helperBeanE164;
    @EJB
    private HelperBeanF164 helperBeanF164;
    @EJB
    private HelperBeanG164 helperBeanG164;
    @EJB
    private HelperBeanH164 helperBeanH164;
    @EJB
    private HelperBeanI164 helperBeanI164;
    @EJB
    private HelperBeanJ164 helperBeanJ164;
    @EJB
    private HelperBeanK164 helperBeanK164;
    @EJB
    private HelperBeanL164 helperBeanL164;
    @EJB
    private HelperBeanM164 helperBeanM164;
    @EJB
    private HelperBeanN164 helperBeanN164;
    @EJB
    private HelperBeanO164 helperBeanO164;

    @EJB
    private StartupBean164 startupBean164;

    public String whoAmI() {
        return "i'm ExampleService164 "
        + helperBeanA164.identify()
        + helperBeanB164.identify()
        + helperBeanC164.identify()
        + helperBeanD164.identify()
        + helperBeanE164.identify()
        + helperBeanF164.identify()
        + helperBeanG164.identify()
        + helperBeanH164.identify()
        + helperBeanI164.identify()
        + helperBeanJ164.identify()
        + helperBeanK164.identify()
        + helperBeanL164.identify()
        + helperBeanM164.identify()
        + helperBeanN164.identify()
        + helperBeanO164.identify();
    }

}
