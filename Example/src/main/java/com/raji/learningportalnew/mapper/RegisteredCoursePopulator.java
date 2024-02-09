package com.raji.learningportalnew.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.raji.learningportalnew.dto.RegisteredCourseDTO;
import com.raji.learningportalnew.entity.RegisteredCourseEntity;

@Mapper
public interface RegisteredCoursePopulator {
	RegisteredCoursePopulator INSTANCE = Mappers.getMapper(RegisteredCoursePopulator.class);

	RegisteredCourseEntity populateRegisteredCourse(RegisteredCourseDTO regCourseDTO);

	RegisteredCourseDTO regCourseEntitytoDTO(RegisteredCourseEntity regCourse);
}
