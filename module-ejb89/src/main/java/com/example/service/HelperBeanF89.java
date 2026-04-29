package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF89 {

    @EJB
    private HelperBeanE89 helperBeanE89;

    public String identify() {
        return "HelperBeanF89";
    }
}
