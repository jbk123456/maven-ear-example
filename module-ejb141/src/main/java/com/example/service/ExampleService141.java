package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService141 {

    @EJB
    private HelperBeanA141 helperBeanA141;
    @EJB
    private HelperBeanB141 helperBeanB141;
    @EJB
    private HelperBeanC141 helperBeanC141;
    @EJB
    private HelperBeanD141 helperBeanD141;
    @EJB
    private HelperBeanE141 helperBeanE141;
    @EJB
    private HelperBeanF141 helperBeanF141;
    @EJB
    private HelperBeanG141 helperBeanG141;
    @EJB
    private HelperBeanH141 helperBeanH141;
    @EJB
    private HelperBeanI141 helperBeanI141;
    @EJB
    private HelperBeanJ141 helperBeanJ141;
    @EJB
    private HelperBeanK141 helperBeanK141;
    @EJB
    private HelperBeanL141 helperBeanL141;
    @EJB
    private HelperBeanM141 helperBeanM141;
    @EJB
    private HelperBeanN141 helperBeanN141;
    @EJB
    private HelperBeanO141 helperBeanO141;

    @EJB
    private StartupBean141 startupBean141;

    public String whoAmI() {
        return "i'm ExampleService141 "
        + helperBeanA141.identify()
        + helperBeanB141.identify()
        + helperBeanC141.identify()
        + helperBeanD141.identify()
        + helperBeanE141.identify()
        + helperBeanF141.identify()
        + helperBeanG141.identify()
        + helperBeanH141.identify()
        + helperBeanI141.identify()
        + helperBeanJ141.identify()
        + helperBeanK141.identify()
        + helperBeanL141.identify()
        + helperBeanM141.identify()
        + helperBeanN141.identify()
        + helperBeanO141.identify();
    }

}
