package io.jat.job.view;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import lombok.Setter;

@Route("")
class JobView extends VerticalLayout {
    @Setter
    private transient JobViewModel jobViewModel;
    private final Label title = new Label("title");
    private final Label company = new Label("company");
    private final Label location = new Label("location");
    private final Label locationType = new Label("locationType");
    private final Label jobType = new Label("jobType");
    private final Label experienceLevel = new Label("experienceLevel");

    JobView(){
        initComponents();
    }

    private void initComponents() {
        add(title, company, location, locationType, jobType, experienceLevel);
        setSizeFull();
    }

    void setViewModel(JobViewModel jobViewModel) {
        this.jobViewModel = jobViewModel;
        update();
    }

    private void update() {
        title.setText(jobViewModel.getTitle());
        company.setText(jobViewModel.getCompany());
        location.setText(jobViewModel.getLocation());
        locationType.setText(jobViewModel.getLocationType());
        jobType.setText(jobViewModel.getJobType());
        experienceLevel.setText(jobViewModel.getExperienceLevel());
    }
}
