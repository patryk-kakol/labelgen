package com.protolab.rest.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.hql.internal.ast.tree.AbstractStatement;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PrecautionaryStatementDto {

    private Long precautionaryStatementId;
    private String code;
    private String text;

}
