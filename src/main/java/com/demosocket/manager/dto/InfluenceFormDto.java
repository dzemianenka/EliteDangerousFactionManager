package com.demosocket.manager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InfluenceFormDto {

    private List<InfluenceDto> influenceDtoList;

//    public void addInfluenceDto(InfluenceDto influenceDto) {
//        this.influenceDtoList.add(influenceDto);
//    }
}