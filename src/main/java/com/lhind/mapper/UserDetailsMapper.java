package com.lhind.mapper;

import com.lhind.model.dto.UserDetailsDTO;
import com.lhind.model.entity.UserDetails;

public class UserDetailsMapper extends AbstractMapper<UserDetails, UserDetailsDTO> {

    @Override
    public UserDetails toEntity(UserDetailsDTO userDetailsDTO) {
        return null;
    }

    @Override
    public UserDetailsDTO toDTO(UserDetails entity) {
        if (entity == null) {
            return null;
        }

        UserDetailsDTO userDetailsDTO = new UserDetailsDTO();
        userDetailsDTO.setId(entity.getId());
        userDetailsDTO.setFirst_name(entity.getFirstName());
        userDetailsDTO.setLast_name(entity.getLastName());
        userDetailsDTO.setEmail(entity.getEmail());
        userDetailsDTO.setPhone_number(entity.getPhoneNumber());
        return userDetailsDTO;
    }
}
