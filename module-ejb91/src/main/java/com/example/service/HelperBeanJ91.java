package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ91 {

    @EJB
    private HelperBeanI91 helperBeanI91;

    public String identify() {
        return "HelperBeanJ91";
    }
}
