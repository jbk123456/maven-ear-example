package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService40 {

    @EJB
    private HelperBeanA40 helperBeanA40;
    @EJB
    private HelperBeanB40 helperBeanB40;
    @EJB
    private HelperBeanC40 helperBeanC40;
    @EJB
    private HelperBeanD40 helperBeanD40;
    @EJB
    private HelperBeanE40 helperBeanE40;
    @EJB
    private HelperBeanF40 helperBeanF40;
    @EJB
    private HelperBeanG40 helperBeanG40;
    @EJB
    private HelperBeanH40 helperBeanH40;
    @EJB
    private HelperBeanI40 helperBeanI40;
    @EJB
    private HelperBeanJ40 helperBeanJ40;
    @EJB
    private HelperBeanK40 helperBeanK40;
    @EJB
    private HelperBeanL40 helperBeanL40;
    @EJB
    private HelperBeanM40 helperBeanM40;
    @EJB
    private HelperBeanN40 helperBeanN40;
    @EJB
    private HelperBeanO40 helperBeanO40;

    @EJB
    private StartupBean40 startupBean40;

    public String whoAmI() {
        return "i'm ExampleService40 "
        + helperBeanA40.identify()
        + helperBeanB40.identify()
        + helperBeanC40.identify()
        + helperBeanD40.identify()
        + helperBeanE40.identify()
        + helperBeanF40.identify()
        + helperBeanG40.identify()
        + helperBeanH40.identify()
        + helperBeanI40.identify()
        + helperBeanJ40.identify()
        + helperBeanK40.identify()
        + helperBeanL40.identify()
        + helperBeanM40.identify()
        + helperBeanN40.identify()
        + helperBeanO40.identify();
    }

}
