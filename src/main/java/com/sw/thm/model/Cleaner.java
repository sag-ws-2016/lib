package com.sw.thm.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sw.thm.util.CleanerStateConverter;
import com.sw.thm.util.CleanerStateSerializer;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Cleaner")
@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC)
@NoArgsConstructor
public class Cleaner extends Person {
    @JsonSerialize(using = CleanerStateSerializer.class)
    @Convert(converter = CleanerStateConverter.class)
    protected CleanerStateI cleanerState = new Available();
    @JsonIgnore
    protected int quota = 0;

    public void startWork(){
        cleanerState.startWork(this);
    };
    public void finishWork(){
        cleanerState.finishWork(this);
    };
    public void restock(int restockAmount){cleanerState.restock(this, restockAmount);}

}


