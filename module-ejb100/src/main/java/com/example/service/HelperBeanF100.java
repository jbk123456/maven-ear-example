package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF100 {

    @EJB
    private HelperBeanE100 helperBeanE100;

    public String identify() {
        return "HelperBeanF100";
    }
}
