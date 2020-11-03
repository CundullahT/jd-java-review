package com.cybertek.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {

    OPEN("Open"),IN_PROGRESS("In Progress"),UAT_TEST("UAT Testing"),COMPLETED("Completed");
    private final String value;

}
