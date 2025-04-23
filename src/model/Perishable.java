package model;

import java.time.LocalDate;

public class Perishable {
    private LocalDate expirationDate;

    public Perishable(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean idExpired(){
        return expirationDate.isBefore(LocalDate.now());
    }
}