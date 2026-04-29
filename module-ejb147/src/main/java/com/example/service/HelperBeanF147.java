package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF147 {

    @EJB
    private HelperBeanE147 helperBeanE147;

    public String identify() {
        return "HelperBeanF147";
    }
}
