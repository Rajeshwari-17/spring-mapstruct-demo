package com.raji.learningportalnew.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.raji.learningportalnew.dto.CourseDTO;
import com.raji.learningportalnew.entity.CourseEntity;
import com.raji.learningportalnew.mapper.CoursePopulator;
import com.raji.learningportalnew.repository.CourseRepository;
import com.raji.learningportalnew.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	private final CourseRepository courseRepository;

	public CourseServiceImpl(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@Override
	public List<CourseEntity> getAllCourses() {
		return courseRepository.findAll();
	}

	@Override
	public CourseDTO addCourse(CourseDTO course) {

		CourseEntity courseEntity = CoursePopulator.INSTANCE.populateCourse(course);
		CourseEntity resCourse = courseRepository.save(courseEntity);

		CourseDTO resCourseDTO = CoursePopulator.INSTANCE.courseEntityToDTO(resCourse);
		return resCourseDTO;
	}

	@Override
	public void deleteCourse(Long courseId) {
		courseRepository.deleteById(courseId);
	}

	@Override
	public CourseDTO updateCourse(CourseDTO course) {
		//checking if the course exists
		Optional<CourseEntity> existingCourse = courseRepository.findById(course.getCourseId());

		//if course exists
		if (existingCourse.isPresent()) {

			CourseEntity updatedCourse = CoursePopulator.INSTANCE.populateCourse(course);

			//saving the course
			CourseEntity changedCourse = courseRepository.save(updatedCourse);
			CourseDTO resCourseDTO = CoursePopulator.INSTANCE.courseEntityToDTO(changedCourse);

			return resCourseDTO;

		}
		//returning empty course
		return new CourseDTO();
	}

}
