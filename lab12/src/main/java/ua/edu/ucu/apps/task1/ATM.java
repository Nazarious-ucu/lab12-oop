package ua.edu.ucu.apps.task1;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ATM {
    private Tray firstTray;
    public ATM() {
        firstTray = new Tray500();
        Tray tray200 = new Tray200();
        firstTray.setNext(tray200);
        tray200.setNext(new Tray5());
    }

    public void process(int amount) {
        firstTray.process(amount);
    }
}
