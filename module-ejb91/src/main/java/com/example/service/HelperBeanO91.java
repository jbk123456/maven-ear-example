package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO91 {

    @EJB
    private HelperBeanN91 helperBeanN91;

    public String identify() {
        return "HelperBeanO91";
    }
}
