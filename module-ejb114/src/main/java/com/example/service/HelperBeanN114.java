package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN114 {

    @EJB
    private HelperBeanM114 helperBeanM114;

    public String identify() {
        return "HelperBeanN114";
    }
}
