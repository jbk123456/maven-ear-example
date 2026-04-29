package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC18 {

    @EJB
    private HelperBeanB18 helperBeanB18;

    public String identify() {
        return "HelperBeanC18";
    }
}
