package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ22 {

    @EJB
    private HelperBeanI22 helperBeanI22;

    public String identify() {
        return "HelperBeanJ22";
    }
}
