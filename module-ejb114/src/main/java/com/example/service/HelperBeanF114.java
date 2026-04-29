package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF114 {

    @EJB
    private HelperBeanE114 helperBeanE114;

    public String identify() {
        return "HelperBeanF114";
    }
}
