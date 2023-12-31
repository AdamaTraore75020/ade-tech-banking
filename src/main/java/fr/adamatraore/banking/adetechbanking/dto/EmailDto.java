package fr.adamatraore.banking.adetechbanking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmailDto {
    private String to;
    private String sender;
    private String subject;
    private String body;
}
