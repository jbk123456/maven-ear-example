package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG18 {

    @EJB
    private HelperBeanF18 helperBeanF18;

    public String identify() {
        return "HelperBeanG18";
    }
}
