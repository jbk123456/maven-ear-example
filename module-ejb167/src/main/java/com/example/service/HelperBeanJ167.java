package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ167 {

    @EJB
    private HelperBeanI167 helperBeanI167;

    public String identify() {
        return "HelperBeanJ167";
    }
}
