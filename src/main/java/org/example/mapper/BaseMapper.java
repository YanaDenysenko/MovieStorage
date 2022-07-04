package org.example.mapper;

public interface BaseMapper <M, D>{
    D mapToDto(M m);

    M mapToModel(D d);
}
