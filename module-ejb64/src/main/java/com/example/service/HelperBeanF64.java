package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF64 {

    @EJB
    private HelperBeanE64 helperBeanE64;

    public String identify() {
        return "HelperBeanF64";
    }
}
