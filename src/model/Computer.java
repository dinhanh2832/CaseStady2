package model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Computer implements Serializable {
    private int Id;
    private int status;
    private LocalDateTime timeStart;
    private LocalDateTime timeClose;

    public Computer( int status) {
        this.status = status;
    }

    public Computer() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int isStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ID: " + Id +
                ", Trạng thái: " + status ;
//                ", Thời gian bắt đầu: " + timeStart ;
    }
}
