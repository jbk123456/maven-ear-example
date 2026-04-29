package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI104 {

    @EJB
    private HelperBeanH104 helperBeanH104;

    public String identify() {
        return "HelperBeanI104";
    }
}
