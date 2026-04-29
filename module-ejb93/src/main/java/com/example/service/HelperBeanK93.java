package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK93 {

    @EJB
    private HelperBeanJ93 helperBeanJ93;

    public String identify() {
        return "HelperBeanK93";
    }
}
