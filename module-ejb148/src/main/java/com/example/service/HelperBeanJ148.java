package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ148 {

    @EJB
    private HelperBeanI148 helperBeanI148;

    public String identify() {
        return "HelperBeanJ148";
    }
}
