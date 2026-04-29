package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ119 {

    @EJB
    private HelperBeanI119 helperBeanI119;

    public String identify() {
        return "HelperBeanJ119";
    }
}
