package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC163 {

    @EJB
    private HelperBeanB163 helperBeanB163;

    public String identify() {
        return "HelperBeanC163";
    }
}
