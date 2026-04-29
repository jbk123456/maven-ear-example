package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ89 {

    @EJB
    private HelperBeanI89 helperBeanI89;

    public String identify() {
        return "HelperBeanJ89";
    }
}
