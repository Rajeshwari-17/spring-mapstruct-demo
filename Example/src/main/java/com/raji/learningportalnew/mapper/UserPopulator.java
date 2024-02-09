package com.raji.learningportalnew.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.raji.learningportalnew.dto.UserDTO;
import com.raji.learningportalnew.entity.UserEntity;

@Mapper
public interface UserPopulator {
	UserPopulator INSTANCE = Mappers.getMapper(UserPopulator.class);

	UserEntity populateUser(UserDTO userDTO);

	UserDTO userEntitytoDTO(UserEntity user);
}
