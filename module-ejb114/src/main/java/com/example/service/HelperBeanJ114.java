package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ114 {

    @EJB
    private HelperBeanI114 helperBeanI114;

    public String identify() {
        return "HelperBeanJ114";
    }
}
