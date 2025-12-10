/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author supan
 */
@Named
@ViewScoped
public class ClockView implements Serializable {

    private LocalDateTime dateTime;

    @PostConstruct
    public void init() {
        dateTime = LocalDateTime.now().plusYears(6).plusMonths(1).plusHours(12);
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}