package com.breeze.ts.api.service;

import com.breeze.ts.common.dto.ApplicantDto;
import com.breeze.ts.common.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("ApplicantProvider")
public interface ApplicantService {
    @PostMapping("/provider/applicant/save.do")
    R save(@RequestBody ApplicantDto applicantDto);
}
