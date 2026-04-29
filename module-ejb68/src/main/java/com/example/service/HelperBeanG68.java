package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG68 {

    @EJB
    private HelperBeanF68 helperBeanF68;

    public String identify() {
        return "HelperBeanG68";
    }
}
