package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG124 {

    @EJB
    private HelperBeanF124 helperBeanF124;

    public String identify() {
        return "HelperBeanG124";
    }
}
