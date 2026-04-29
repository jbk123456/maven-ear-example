package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ104 {

    @EJB
    private HelperBeanI104 helperBeanI104;

    public String identify() {
        return "HelperBeanJ104";
    }
}
