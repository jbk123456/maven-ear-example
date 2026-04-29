package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK91 {

    @EJB
    private HelperBeanJ91 helperBeanJ91;

    public String identify() {
        return "HelperBeanK91";
    }
}
