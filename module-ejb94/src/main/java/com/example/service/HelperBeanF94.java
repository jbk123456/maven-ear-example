package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF94 {

    @EJB
    private HelperBeanE94 helperBeanE94;

    public String identify() {
        return "HelperBeanF94";
    }
}
