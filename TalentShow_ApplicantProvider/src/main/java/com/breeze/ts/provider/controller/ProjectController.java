package com.breeze.ts.provider.controller;

import com.breeze.ts.common.dto.ProjectDto;
import com.breeze.ts.common.vo.R;
import com.breeze.ts.provider.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
    @Autowired
    ProjectService projectService;
    @PostMapping("/provider/project/sava.do")
    public R sava(@RequestBody ProjectDto projectDto){
        return projectService.sava(projectDto);
    }
}
