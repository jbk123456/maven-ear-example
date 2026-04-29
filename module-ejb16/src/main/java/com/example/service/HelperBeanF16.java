package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF16 {

    @EJB
    private HelperBeanE16 helperBeanE16;

    public String identify() {
        return "HelperBeanF16";
    }
}
