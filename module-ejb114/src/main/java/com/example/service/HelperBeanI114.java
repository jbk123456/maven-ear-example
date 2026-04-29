package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI114 {

    @EJB
    private HelperBeanH114 helperBeanH114;

    public String identify() {
        return "HelperBeanI114";
    }
}
