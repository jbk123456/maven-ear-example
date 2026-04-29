package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO93 {

    @EJB
    private HelperBeanN93 helperBeanN93;

    public String identify() {
        return "HelperBeanO93";
    }
}
