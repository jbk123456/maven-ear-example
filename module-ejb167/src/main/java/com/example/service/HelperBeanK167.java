package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK167 {

    @EJB
    private HelperBeanJ167 helperBeanJ167;

    public String identify() {
        return "HelperBeanK167";
    }
}
