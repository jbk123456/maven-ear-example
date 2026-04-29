package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK170 {

    @EJB
    private HelperBeanJ170 helperBeanJ170;

    public String identify() {
        return "HelperBeanK170";
    }
}
