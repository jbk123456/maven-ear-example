package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI129 {

    @EJB
    private HelperBeanH129 helperBeanH129;

    public String identify() {
        return "HelperBeanI129";
    }
}
