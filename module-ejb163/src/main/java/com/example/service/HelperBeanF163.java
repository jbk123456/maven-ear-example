package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF163 {

    @EJB
    private HelperBeanE163 helperBeanE163;

    public String identify() {
        return "HelperBeanF163";
    }
}
