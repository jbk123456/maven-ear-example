package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK114 {

    @EJB
    private HelperBeanJ114 helperBeanJ114;

    public String identify() {
        return "HelperBeanK114";
    }
}
