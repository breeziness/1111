package com.breeze.ts.provider.controller;

import com.breeze.ts.common.dto.ApplicantDto;
import com.breeze.ts.common.dto.ApplicantdetailDto;
import com.breeze.ts.common.vo.R;
import com.breeze.ts.provider.dao.ApplicantdetailDao;
import com.breeze.ts.provider.service.ApplicantdetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicantDetailController {

    @Autowired(required = false)
    ApplicantdetailService applicantdetailService;
    @PostMapping("/provider/applicantDetail/save.do")
    public R save(@RequestBody ApplicantdetailDto applicantdetailDto){
        return applicantdetailService.sava(applicantdetailDto);
    }
}
