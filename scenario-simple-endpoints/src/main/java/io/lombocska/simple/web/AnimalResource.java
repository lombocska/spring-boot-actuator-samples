package io.lombocska.simple.web;

import io.lombocska.simple.service.AnimalService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AnimalResource {

    private final AnimalService service;

    @GetMapping("/animals")
    public ResponseEntity getAnimals() {
        return ResponseEntity.ok(service.getAnimals());
    }

//    @GetMapping("/test-session")
//    public ResponseEntity getSession(HttpSession session){
//        if (session.getAttribute("visit-counter") == null ){
//            session.setAttribute("visit-counter" , 1 );
//            log.info( "New user ");
//            return ResponseEntity.ok(1);
//        } else {
//            log.info( "visit count : " + session.getAttribute("visit-counter")  );
//            session.setAttribute("visit-counter" , (int) session.getAttribute("visit-counter") + 1 );
//            return ResponseEntity.ok((int) session.getAttribute("visit-counter"));
//        }
//    }
}
