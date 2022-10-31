package com.idaoben.instrument.common;

import com.idaoben.utils.valued_enum.DescribedValuedEnum;

/**
 * @author hezifeng
 * @create 2022/10/31 10:46
 */
public enum GenderType implements DescribedValuedEnum<Integer> {
    UNLIMITED(0,"不限"),
    MALE(1,"男"),
    FEMALE(2,"女");

    private final int value;
    private final String description;

    GenderType(int value, String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public String description() {
        return description;
    }

    public String getDescription(){
        return description;
    }


    @Override
    public Integer value() {
        return value;
    }

    public static GenderType valueOfId(int value){
        for(GenderType genderType : values()){
            if (genderType.value() == value) {
                return genderType;
            }
        }
        return null;
    }
}

