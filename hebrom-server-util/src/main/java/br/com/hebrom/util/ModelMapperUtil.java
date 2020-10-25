package br.com.hebrom.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

public final class ModelMapperUtil {

    private ModelMapperUtil() {

    }

    /**
     * Convert list entidade em list DTO
     * 
     * @param <S>
     * @param <T>
     * @param source
     * @param targetClass
     * @return List<T>
     */
    public final static <S, T> List<T> mapList(List<S> source, Class<T> targetClass) {
        ModelMapper modelMapper = new ModelMapper();
        return source.stream().map(element -> modelMapper.map(element, targetClass)).collect(Collectors.toList());
    }

    /**
     * Convert entidade em DTO
     * 
     * @param <T>
     * @param source
     * @param targetClass
     * @return T
     */
    public final static <T> T convert(Object source, Class<T> targetClass) {
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(source, targetClass);
    }

}
