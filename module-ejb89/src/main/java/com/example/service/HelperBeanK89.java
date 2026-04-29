package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK89 {

    @EJB
    private HelperBeanJ89 helperBeanJ89;

    public String identify() {
        return "HelperBeanK89";
    }
}
