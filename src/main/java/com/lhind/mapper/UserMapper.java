package com.lhind.mapper;

import com.lhind.model.dto.UserDTO;
import com.lhind.model.entity.User;

public class UserMapper extends AbstractMapper<User, UserDTO> {
    @Override
    public User toEntity(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO toDTO(User entity) {
        if (entity == null) {
            return null;
        }
        UserDTO userDTO = new UserDTO();
        userDTO.setId(entity.getId());
        userDTO.setUsername(entity.getUsername());
        userDTO.setPassword(entity.getPassword());
        userDTO.setRole(entity.getRole());
        return userDTO;
    }
}
