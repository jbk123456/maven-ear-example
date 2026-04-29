package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI135 {

    @EJB
    private HelperBeanH135 helperBeanH135;

    public String identify() {
        return "HelperBeanI135";
    }
}
