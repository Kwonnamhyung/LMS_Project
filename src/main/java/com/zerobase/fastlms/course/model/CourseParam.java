package com.zerobase.fastlms.course.model;

import com.zerobase.fastlms.comfiguration.model.CommonParam;
import lombok.Data;

@Data
public class CourseParam extends CommonParam{

    long id; // course.id
    long categoryId;


}
