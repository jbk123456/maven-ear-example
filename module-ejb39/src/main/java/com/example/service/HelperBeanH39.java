package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH39 {

    @EJB
    private HelperBeanG39 helperBeanG39;

    public String identify() {
        return "HelperBeanH39";
    }
}
