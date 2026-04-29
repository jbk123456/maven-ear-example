package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI98 {

    @EJB
    private HelperBeanH98 helperBeanH98;

    public String identify() {
        return "HelperBeanI98";
    }
}
