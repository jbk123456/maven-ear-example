package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD51 {

    @EJB
    private HelperBeanC51 helperBeanC51;

    public String identify() {
        return "HelperBeanD51";
    }
}
