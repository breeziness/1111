package com.breeze.ts.api.api;

import com.breeze.ts.api.service.ProjectService;
import com.breeze.ts.common.dto.ProjectDto;
import com.breeze.ts.common.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
    @Autowired
    ProjectService projectService;
    @PostMapping("/api/project/save.do")
    public R save(@RequestBody ProjectDto projectDto){
        return projectService.save(projectDto);
    }
}
