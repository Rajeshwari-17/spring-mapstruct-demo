package com.raji.learningportalnew.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.raji.learningportalnew.dto.CourseDTO;
import com.raji.learningportalnew.entity.CourseEntity;

@Mapper
public interface CoursePopulator {
	CoursePopulator INSTANCE = Mappers.getMapper(CoursePopulator.class);

	CourseEntity populateCourse(CourseDTO courseDTO);

	CourseDTO courseEntityToDTO(CourseEntity course);
}
