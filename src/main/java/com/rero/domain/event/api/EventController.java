package com.rero.domain.event.api;

import com.rero.domain.event.dto.EventDto;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@NoArgsConstructor
@Slf4j
@RequestMapping("/api/event")
public class EventController {

    @GetMapping("")
    public ResponseEntity<List<EventDto.Response>> select() {
        return null;
    }

    @GetMapping("/{eventNo}")
    public ResponseEntity<EventDto.Response> select(@PathVariable String eventNo) {
        return null;
    }

    @PostMapping("")
    public ResponseEntity<EventDto.Response> insert(@RequestBody EventDto.Request eventRequestDto) {
        log.info("[EventController][insert] eventRequestDto : {}", eventRequestDto);
        return null;
    }

    @PutMapping("")
    public ResponseEntity<EventDto.Response> save() {
        return null;
    }

    @PatchMapping("{eventNo}")
    public ResponseEntity<EventDto.Response> update(@PathVariable String eventNo) {
        return null;
    }

    @DeleteMapping("{eventNo}")
    public ResponseEntity<EventDto.Response> delete(@PathVariable String eventNo) {
        return null;
    }
}
