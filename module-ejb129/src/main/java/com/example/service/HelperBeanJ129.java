package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ129 {

    @EJB
    private HelperBeanI129 helperBeanI129;

    public String identify() {
        return "HelperBeanJ129";
    }
}
