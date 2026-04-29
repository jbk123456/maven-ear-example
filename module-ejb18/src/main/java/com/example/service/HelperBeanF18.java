package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF18 {

    @EJB
    private HelperBeanE18 helperBeanE18;

    public String identify() {
        return "HelperBeanF18";
    }
}
