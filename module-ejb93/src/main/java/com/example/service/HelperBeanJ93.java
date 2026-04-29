package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ93 {

    @EJB
    private HelperBeanI93 helperBeanI93;

    public String identify() {
        return "HelperBeanJ93";
    }
}
