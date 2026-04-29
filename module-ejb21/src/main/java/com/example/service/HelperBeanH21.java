package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH21 {

    @EJB
    private HelperBeanG21 helperBeanG21;

    public String identify() {
        return "HelperBeanH21";
    }
}
