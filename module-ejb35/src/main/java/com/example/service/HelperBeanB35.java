package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB35 {

    @EJB
    private HelperBeanA35 helperBeanA35;

    public String identify() {
        return "HelperBeanB35";
    }
}
