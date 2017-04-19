package com.sw.thm.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC)
public class PassengerTransportLicense extends License {
    public PassengerTransportLicense() {
    }
}
