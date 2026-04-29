package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC51 {

    @EJB
    private HelperBeanB51 helperBeanB51;

    public String identify() {
        return "HelperBeanC51";
    }
}
