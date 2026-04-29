package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ105 {

    @EJB
    private HelperBeanI105 helperBeanI105;

    public String identify() {
        return "HelperBeanJ105";
    }
}
