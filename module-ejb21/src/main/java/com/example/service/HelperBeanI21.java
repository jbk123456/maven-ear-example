package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI21 {

    @EJB
    private HelperBeanH21 helperBeanH21;

    public String identify() {
        return "HelperBeanI21";
    }
}
