package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE114 {

    @EJB
    private HelperBeanD114 helperBeanD114;

    public String identify() {
        return "HelperBeanE114";
    }
}
