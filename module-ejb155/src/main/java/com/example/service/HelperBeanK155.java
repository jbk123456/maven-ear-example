package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK155 {

    @EJB
    private HelperBeanJ155 helperBeanJ155;

    public String identify() {
        return "HelperBeanK155";
    }
}
