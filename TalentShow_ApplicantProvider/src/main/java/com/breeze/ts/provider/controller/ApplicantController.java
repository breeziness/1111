package com.breeze.ts.provider.controller;

import com.breeze.ts.common.dto.ApplicantDto;
import com.breeze.ts.common.util.RUtils;
import com.breeze.ts.common.vo.R;
import com.breeze.ts.entity.Applicant;
import com.breeze.ts.provider.dao.ApplicantDao;
import com.breeze.ts.provider.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicantController {

    @Autowired(required = false)
    ApplicantService applicantService;
    @PostMapping("/provider/applicant/save.do")
    public R save(@RequestBody ApplicantDto applicantDto){
        return applicantService.save(applicantDto);
    }
}
