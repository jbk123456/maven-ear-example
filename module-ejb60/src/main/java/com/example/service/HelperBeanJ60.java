package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ60 {

    @EJB
    private HelperBeanI60 helperBeanI60;

    public String identify() {
        return "HelperBeanJ60";
    }
}
