package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF33 {

    @EJB
    private HelperBeanE33 helperBeanE33;

    public String identify() {
        return "HelperBeanF33";
    }
}
