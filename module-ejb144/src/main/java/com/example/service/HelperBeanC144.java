package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC144 {

    @EJB
    private HelperBeanB144 helperBeanB144;

    public String identify() {
        return "HelperBeanC144";
    }
}
