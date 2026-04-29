package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG33 {

    @EJB
    private HelperBeanF33 helperBeanF33;

    public String identify() {
        return "HelperBeanG33";
    }
}
