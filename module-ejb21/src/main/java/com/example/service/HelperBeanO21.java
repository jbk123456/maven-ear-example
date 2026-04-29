package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO21 {

    @EJB
    private HelperBeanN21 helperBeanN21;

    public String identify() {
        return "HelperBeanO21";
    }
}
