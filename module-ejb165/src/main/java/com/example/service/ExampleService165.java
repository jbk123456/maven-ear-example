package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ExampleService165 {

    @EJB
    private HelperBeanA165 helperBeanA165;
    @EJB
    private HelperBeanB165 helperBeanB165;
    @EJB
    private HelperBeanC165 helperBeanC165;
    @EJB
    private HelperBeanD165 helperBeanD165;
    @EJB
    private HelperBeanE165 helperBeanE165;
    @EJB
    private HelperBeanF165 helperBeanF165;
    @EJB
    private HelperBeanG165 helperBeanG165;
    @EJB
    private HelperBeanH165 helperBeanH165;
    @EJB
    private HelperBeanI165 helperBeanI165;
    @EJB
    private HelperBeanJ165 helperBeanJ165;
    @EJB
    private HelperBeanK165 helperBeanK165;
    @EJB
    private HelperBeanL165 helperBeanL165;
    @EJB
    private HelperBeanM165 helperBeanM165;
    @EJB
    private HelperBeanN165 helperBeanN165;
    @EJB
    private HelperBeanO165 helperBeanO165;

    @EJB
    private StartupBean165 startupBean165;

    public String whoAmI() {
        return "i'm ExampleService165 "
        + helperBeanA165.identify()
        + helperBeanB165.identify()
        + helperBeanC165.identify()
        + helperBeanD165.identify()
        + helperBeanE165.identify()
        + helperBeanF165.identify()
        + helperBeanG165.identify()
        + helperBeanH165.identify()
        + helperBeanI165.identify()
        + helperBeanJ165.identify()
        + helperBeanK165.identify()
        + helperBeanL165.identify()
        + helperBeanM165.identify()
        + helperBeanN165.identify()
        + helperBeanO165.identify();
    }

}
