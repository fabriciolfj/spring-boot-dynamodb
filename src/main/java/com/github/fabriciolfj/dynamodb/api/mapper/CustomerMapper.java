package com.github.fabriciolfj.dynamodb.api.mapper;

import com.github.fabriciolfj.dynamodb.api.dto.CustomerDTO;
import com.github.fabriciolfj.dynamodb.domain.model.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    Customer toModel(final CustomerDTO dto);
}
