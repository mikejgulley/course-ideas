package com.lumatikmedia.apps.model;

import java.util.List;

/**
 * Created by mgulley on 7/28/2016.
 */
public interface CourseIdeaDAO {
    boolean add(CourseIdea idea);

    List<CourseIdea> findAll();
}
