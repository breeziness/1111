package com.breeze.ts.provider.service.impl;

import com.breeze.ts.common.dto.ProjectDto;
import com.breeze.ts.common.util.RUtils;
import com.breeze.ts.common.vo.R;
import com.breeze.ts.entity.Project;
import com.breeze.ts.provider.dao.ProjectDao;
import com.breeze.ts.provider.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired(required = false)
    ProjectDao projectDao;
    @Override
    public R sava(ProjectDto projectDto) {
        Project project = new Project();
        project.setAid(projectDto.getAid());
        project.setInfo(projectDto.getInfo());
        project.setMonths(projectDto.getMonths());
        project.setName(projectDto.getName());
        project.setSelfmodule(projectDto.getSelfmodule());
        project.setStarttime(projectDto.getStarttime());
        project.setSkill(projectDto.getSkill());
        int insert = projectDao.insert(project);
        return RUtils.setOK("添加成功");
    }
}
