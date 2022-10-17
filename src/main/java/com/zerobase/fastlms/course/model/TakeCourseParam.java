package com.zerobase.fastlms.course.model;

import com.zerobase.fastlms.comfiguration.model.CommonParam;
import lombok.Data;

@Data
public class TakeCourseParam extends CommonParam{

    long id; // course.id
    String status;

    String userId;

    long searchCourseId;


}
