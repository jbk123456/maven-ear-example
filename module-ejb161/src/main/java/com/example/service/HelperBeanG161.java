package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG161 {

    @EJB
    private HelperBeanF161 helperBeanF161;

    public String identify() {
        return "HelperBeanG161";
    }
}
