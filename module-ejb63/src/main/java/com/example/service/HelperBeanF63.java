package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF63 {

    @EJB
    private HelperBeanE63 helperBeanE63;

    public String identify() {
        return "HelperBeanF63";
    }
}
