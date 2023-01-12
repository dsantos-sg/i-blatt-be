package com.dsantos.iblattbe.controller;

import com.dsantos.iblattbe.model.Tutorial;

public class TutorialInput {
  private String title;
  private String description;
  private boolean published;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isPublished() {
    return published;
  }

  public void setPublished(boolean published) {
    this.published = published;
  }

  public Tutorial getTutorialEntity(){
    Tutorial tutorial = new Tutorial();
    tutorial.setTitle(this.title);
    tutorial.setDescription(this.description);
    tutorial.setPublished(this.published);
    return tutorial;
  }
}
