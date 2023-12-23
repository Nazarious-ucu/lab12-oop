package ua.edu.ucu.apps.task1;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Tray {
    private int denomination;
    private Tray next;

    public Tray(int denomination) {
        this.denomination = denomination;
    }

    public void setNext(Tray tray) {
        this.next = tray;
    }

    public void process(int amount) {
        int number = amount % this.denomination;
        if (next != null) {
            next.process(number);
        }
        else if (number > 0) {
            throw new IllegalArgumentException();
        }
        System.out.println("You should take " + amount / this.denomination + " of denomination " + this.denomination);
    }
}
