package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI47 {

    @EJB
    private HelperBeanH47 helperBeanH47;

    public String identify() {
        return "HelperBeanI47";
    }
}
