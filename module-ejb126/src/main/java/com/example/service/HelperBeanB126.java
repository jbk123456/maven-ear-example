package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB126 {

    @EJB
    private HelperBeanA126 helperBeanA126;

    public String identify() {
        return "HelperBeanB126";
    }
}
