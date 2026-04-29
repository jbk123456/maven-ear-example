package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI163 {

    @EJB
    private HelperBeanH163 helperBeanH163;

    public String identify() {
        return "HelperBeanI163";
    }
}
