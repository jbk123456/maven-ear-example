package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG163 {

    @EJB
    private HelperBeanF163 helperBeanF163;

    public String identify() {
        return "HelperBeanG163";
    }
}
