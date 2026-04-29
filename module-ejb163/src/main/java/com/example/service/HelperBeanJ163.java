package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ163 {

    @EJB
    private HelperBeanI163 helperBeanI163;

    public String identify() {
        return "HelperBeanJ163";
    }
}
