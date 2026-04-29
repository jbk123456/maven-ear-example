package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ51 {

    @EJB
    private HelperBeanI51 helperBeanI51;

    public String identify() {
        return "HelperBeanJ51";
    }
}
