package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG115 {

    @EJB
    private HelperBeanF115 helperBeanF115;

    public String identify() {
        return "HelperBeanG115";
    }
}
