package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC33 {

    @EJB
    private HelperBeanB33 helperBeanB33;

    public String identify() {
        return "HelperBeanC33";
    }
}
