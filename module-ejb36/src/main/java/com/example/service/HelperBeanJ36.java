package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ36 {

    @EJB
    private HelperBeanI36 helperBeanI36;

    public String identify() {
        return "HelperBeanJ36";
    }
}
