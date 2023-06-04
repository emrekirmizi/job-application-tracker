package io.jat.job.entity;

record Job(
        String title,
        String company,
        String location,
        String locationType,
        String jobType,
        String experienceLevel) {
}
