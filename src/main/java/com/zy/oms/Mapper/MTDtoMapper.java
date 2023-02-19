package com.zy.oms.Mapper;

import com.zy.oms.dto.MT.MedicineListDto;
import com.zy.oms.pojo.entity.YwKck;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MTDtoMapper {
    MTDtoMapper INSTANCE = Mappers.getMapper( MTDtoMapper.class );
//    @Mappings({
//            @Mapping(source ="hh", target ="app_medicine_code"),
//            @Mapping(source ="lsj", target ="price"),
//            @Mapping(source ="jj", target ="stock"),
//            @Mapping(target ="category_code",ignore = true),
//            //@Mapping(target ="category_name",ignore = true),
//            @Mapping(target ="sequence",ignore = true),
//            @Mapping(target ="limit_sale_info",ignore = true),
//            @Mapping(target ="expiry_date",expression = "java(ywkck.getCreateDate())",dateFormat = "yyyy-MM-dd")
//    })
//    List<MedicineListDto> toMecicineListDto(List<YwKck> ywkck);
}
