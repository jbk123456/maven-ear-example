package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF107 {

    @EJB
    private HelperBeanE107 helperBeanE107;

    public String identify() {
        return "HelperBeanF107";
    }
}
