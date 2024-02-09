package com.raji.learningportalnew.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.raji.learningportalnew.dto.FavouriteCourseDTO;
import com.raji.learningportalnew.entity.FavouriteCourseEntity;

@Mapper
public interface FavouriteCoursePopulator {
	FavouriteCoursePopulator INSTANCE = Mappers.getMapper(FavouriteCoursePopulator.class);

	FavouriteCourseEntity populateFavouriteCourse(FavouriteCourseDTO favouriteCourseDTO);

	FavouriteCourseDTO favCourseEntitytoDTO(FavouriteCourseEntity favCourse);
}
