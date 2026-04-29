package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG113 {

    @EJB
    private HelperBeanF113 helperBeanF113;

    public String identify() {
        return "HelperBeanG113";
    }
}
