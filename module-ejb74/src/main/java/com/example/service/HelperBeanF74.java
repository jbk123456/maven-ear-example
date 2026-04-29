package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF74 {

    @EJB
    private HelperBeanE74 helperBeanE74;

    public String identify() {
        return "HelperBeanF74";
    }
}
