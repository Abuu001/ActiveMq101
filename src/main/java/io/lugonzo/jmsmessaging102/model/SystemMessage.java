package io.lugonzo.jmsmessaging102.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SystemMessage implements Serializable {

    private static final long serialVersionUID=1L;

    private String source;
    private String message;
}
