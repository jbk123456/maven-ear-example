package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ155 {

    @EJB
    private HelperBeanI155 helperBeanI155;

    public String identify() {
        return "HelperBeanJ155";
    }
}
