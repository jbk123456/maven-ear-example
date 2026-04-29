package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI121 {

    @EJB
    private HelperBeanH121 helperBeanH121;

    public String identify() {
        return "HelperBeanI121";
    }
}
