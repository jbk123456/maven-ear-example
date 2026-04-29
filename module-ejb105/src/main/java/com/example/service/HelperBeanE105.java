package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE105 {

    @EJB
    private HelperBeanD105 helperBeanD105;

    public String identify() {
        return "HelperBeanE105";
    }
}
