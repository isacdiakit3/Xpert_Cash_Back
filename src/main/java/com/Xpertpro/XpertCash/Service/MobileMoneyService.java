package com.Xpertpro.XpertCash.Service;

import com.Xpertpro.XpertCash.Repository.MobileMoneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobileMoneyService {

    @Autowired
    private MobileMoneyRepository mobileMoneyRepository;
}
