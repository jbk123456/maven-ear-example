package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ147 {

    @EJB
    private HelperBeanI147 helperBeanI147;

    public String identify() {
        return "HelperBeanJ147";
    }
}
