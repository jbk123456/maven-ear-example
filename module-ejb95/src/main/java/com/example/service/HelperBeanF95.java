package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF95 {

    @EJB
    private HelperBeanE95 helperBeanE95;

    public String identify() {
        return "HelperBeanF95";
    }
}
