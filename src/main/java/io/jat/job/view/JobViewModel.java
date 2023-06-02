package io.jat.job.view;

import lombok.Data;

@Data
final class JobViewModel {
    private String title;
    private String company;
    private String location;
    private String locationType;
    private String jobType;
    private String experienceLevel;
}
