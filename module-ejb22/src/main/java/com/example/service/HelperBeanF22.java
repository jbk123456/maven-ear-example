package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF22 {

    @EJB
    private HelperBeanE22 helperBeanE22;

    public String identify() {
        return "HelperBeanF22";
    }
}
