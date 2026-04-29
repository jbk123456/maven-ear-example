package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG95 {

    @EJB
    private HelperBeanF95 helperBeanF95;

    public String identify() {
        return "HelperBeanG95";
    }
}
