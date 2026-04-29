package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI39 {

    @EJB
    private HelperBeanH39 helperBeanH39;

    public String identify() {
        return "HelperBeanI39";
    }
}
