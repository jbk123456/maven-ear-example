package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO167 {

    @EJB
    private HelperBeanN167 helperBeanN167;

    public String identify() {
        return "HelperBeanO167";
    }
}
