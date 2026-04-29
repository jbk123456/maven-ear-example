package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF175 {

    @EJB
    private HelperBeanE175 helperBeanE175;

    public String identify() {
        return "HelperBeanF175";
    }
}
