package com.example.msbeerinventoryservice.web.mappers;

import com.example.msbeerinventoryservice.domain.BeerInventory;
import com.example.msbeerinventoryservice.web.model.BeerInventoryDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    @Mapping(target = "version", ignore = true)
    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
