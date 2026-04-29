package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO47 {

    @EJB
    private HelperBeanN47 helperBeanN47;

    public String identify() {
        return "HelperBeanO47";
    }
}
