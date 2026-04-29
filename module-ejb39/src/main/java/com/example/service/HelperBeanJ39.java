package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ39 {

    @EJB
    private HelperBeanI39 helperBeanI39;

    public String identify() {
        return "HelperBeanJ39";
    }
}
