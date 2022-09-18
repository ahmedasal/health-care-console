package org.healthcare.model;

public enum MeetingStatus {

    completed(0),
    pending(1),
    canceled(2);

    private int value;

    private MeetingStatus(int value) {
        this.value = value;
    }

    public static MeetingStatus changeMeetingStatus(int newMeetingStatus) {
        return switch (newMeetingStatus) {
            case 0 -> MeetingStatus.pending;
            case 1 -> MeetingStatus.completed;
            case 2 -> MeetingStatus.canceled;
            default -> MeetingStatus.pending;
        };

    }
}


