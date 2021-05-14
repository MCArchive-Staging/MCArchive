package io.papermc.hangar.modelold.viewhelpers;

import io.papermc.hangar.model.common.projects.Visibility;
import org.jdbi.v3.core.enums.EnumByOrdinal;

public class ProjectFlag {

    private String reportedBy;
    private String resolvedBy;
    private String projectOwnerName;
    private String projectSlug;
    private Visibility projectVisibility;

    public ProjectFlag() { }

    public String getReportedBy() {
        return reportedBy;
    }

    public void setReportedBy(String reportedBy) {
        this.reportedBy = reportedBy;
    }

    public String getResolvedBy() {
        return resolvedBy;
    }

    public void setResolvedBy(String resolvedBy) {
        this.resolvedBy = resolvedBy;
    }

    public String getProjectOwnerName() {
        return projectOwnerName;
    }

    public void setProjectOwnerName(String projectOwnerName) {
        this.projectOwnerName = projectOwnerName;
    }

    public String getProjectSlug() {
        return projectSlug;
    }

    public void setProjectSlug(String projectSlug) {
        this.projectSlug = projectSlug;
    }

    @EnumByOrdinal
    public Visibility getProjectVisibility() {
        return projectVisibility;
    }

    @EnumByOrdinal
    public void setProjectVisibility(Visibility projectVisibility) {
        this.projectVisibility = projectVisibility;
    }

    public String getProjectNamespace() {
        return projectOwnerName + "/" + projectSlug;
    }
}
