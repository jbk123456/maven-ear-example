package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ13 {

    @EJB
    private HelperBeanI13 helperBeanI13;

    public String identify() {
        return "HelperBeanJ13";
    }
}
