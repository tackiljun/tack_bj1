package org.zerock.bj1.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
public class PageResponseDTO<E> {
    
    private List<E> list;
    private long total; 

    @Builder(buildMethodName = "withAll")
    public PageResponseDTO(List<E> list , long total){
        this.list = list;
        this.total = total;
    }


}
