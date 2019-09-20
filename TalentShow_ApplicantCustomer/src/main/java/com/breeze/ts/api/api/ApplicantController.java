package com.breeze.ts.api.api;

import com.breeze.ts.api.service.ApplicantService;
import com.breeze.ts.common.dto.ApplicantDto;
import com.breeze.ts.common.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "操作求职人", tags = "操作求职人")
@RestController
public class ApplicantController {
    @Autowired
    private ApplicantService applicantService;
    @ApiOperation(value = "新增求职人",notes = "实现求职人信息的新增")
    @PostMapping("/api/applicant/save.do")
    public R save(@RequestBody ApplicantDto applicantDto){
        return applicantService.save(applicantDto);
    }
}
