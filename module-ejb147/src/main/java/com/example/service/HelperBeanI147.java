package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI147 {

    @EJB
    private HelperBeanH147 helperBeanH147;

    public String identify() {
        return "HelperBeanI147";
    }
}
