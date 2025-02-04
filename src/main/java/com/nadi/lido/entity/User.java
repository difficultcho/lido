package com.nadi.lido.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author mzhang27
 * @since 2025/1/30
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
}
