package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO33 {

    @EJB
    private HelperBeanN33 helperBeanN33;

    public String identify() {
        return "HelperBeanO33";
    }
}
