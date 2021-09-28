package com.nucleon.maru.Service;

import com.nucleon.maru.Model.Meeting;

import java.util.Date;
import java.util.List;

public interface ApiService {
    List<Meeting> getMeetings();
    List<Meeting> getMeetingsFilteredByDate(Date date);
    void createMeeting(Meeting meeting);
    void deleteMeeting(Meeting meeting);
}
