package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH163 {

    @EJB
    private HelperBeanG163 helperBeanG163;

    public String identify() {
        return "HelperBeanH163";
    }
}
