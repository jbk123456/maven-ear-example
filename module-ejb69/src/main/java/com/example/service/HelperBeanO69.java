package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO69 {

    @EJB
    private HelperBeanN69 helperBeanN69;

    public String identify() {
        return "HelperBeanO69";
    }
}
