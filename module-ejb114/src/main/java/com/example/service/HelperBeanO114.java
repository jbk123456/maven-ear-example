package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO114 {

    @EJB
    private HelperBeanN114 helperBeanN114;

    public String identify() {
        return "HelperBeanO114";
    }
}
