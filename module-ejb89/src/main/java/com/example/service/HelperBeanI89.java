package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI89 {

    @EJB
    private HelperBeanH89 helperBeanH89;

    public String identify() {
        return "HelperBeanI89";
    }
}
