package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC126 {

    @EJB
    private HelperBeanB126 helperBeanB126;

    public String identify() {
        return "HelperBeanC126";
    }
}
