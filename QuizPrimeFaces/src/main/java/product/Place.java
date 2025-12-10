/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

/**
 *
 * @author supan
 */

import java.io.Serializable;

public class Place implements Serializable {

    private String name;
    private String code;
    private String status;

    // Constructor
    public Place(String name, String code, String status) {
        this.name = name;
        this.code = code;
        this.status = status;
    }

    // Getter และ Setter สำหรับฟิลด์ name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter และ Setter สำหรับฟิลด์ code
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    // Getter และ Setter สำหรับฟิลด์ status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Overriding toString เพื่อให้คืนค่า name เมื่อถูกเรียกใช้เป็นสตริง
    @Override
    public String toString() {
        return this.name;
    }
}