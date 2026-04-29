package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK76 {

    @EJB
    private HelperBeanJ76 helperBeanJ76;

    public String identify() {
        return "HelperBeanK76";
    }
}
