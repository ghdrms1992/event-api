package com.rero.domain.event.dto;

import lombok.Data;

public class EventDto {

    @Data
    public static class Request {

        private String eventName;
    }

    public static class Response {

    }
}