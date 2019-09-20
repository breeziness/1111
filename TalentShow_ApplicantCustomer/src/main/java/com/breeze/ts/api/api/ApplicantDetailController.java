package com.breeze.ts.api.api;

import com.breeze.ts.api.service.ApplicantDetailService;
import com.breeze.ts.common.dto.ApplicantDto;
import com.breeze.ts.common.dto.ApplicantdetailDto;
import com.breeze.ts.common.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "操作求职人详情", tags = "操作求职人详情")
public class ApplicantDetailController {

    @Autowired
    ApplicantDetailService applicantDetailService;
    @PostMapping("/api/applicantDetail/save.do")
    @ApiOperation(value = "新增求职人详情",notes = "实现求职人信息详情的新增")
    public R sava(@RequestBody ApplicantdetailDto applicantdetailDto){
        return applicantDetailService.save(applicantdetailDto);
    }
}
