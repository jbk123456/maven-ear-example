package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF143 {

    @EJB
    private HelperBeanE143 helperBeanE143;

    public String identify() {
        return "HelperBeanF143";
    }
}
