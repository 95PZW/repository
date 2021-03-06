package com.light.mapper;

import com.light.domain.Department;

public interface DepartmentMapper {

    public void insert(Department department);

    public Department getById(Integer id);

    public void update(Department department);

    public void deleteById(Integer id);

}
