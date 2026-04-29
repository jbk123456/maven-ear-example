package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ76 {

    @EJB
    private HelperBeanI76 helperBeanI76;

    public String identify() {
        return "HelperBeanJ76";
    }
}
