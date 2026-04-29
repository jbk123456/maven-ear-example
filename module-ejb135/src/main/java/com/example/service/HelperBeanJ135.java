package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ135 {

    @EJB
    private HelperBeanI135 helperBeanI135;

    public String identify() {
        return "HelperBeanJ135";
    }
}
