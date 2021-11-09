package main;

import model.Computer;
import service.ManagerComputer;
import service.ManagerFood;

public class Main {
    public static void main(String[] args) {
        ManagerComputer.getInstance().addComputer(new Computer(1));
        ManagerComputer.getInstance().addComputer(new Computer(1));
        ManagerComputer.getInstance().addComputer(new Computer(1));
        ManagerComputer.getInstance().addComputer(new Computer(1));
        ManagerComputer.getInstance().addComputer(new Computer(1));
        for (int i = 0; i < ManagerComputer.getInstance().getComputerList().size(); i++) {
            System.out.println(ManagerComputer.getInstance().getComputerList().get(i));
        }
        ManagerComputer.writeToFile("computer.txt",ManagerComputer.getInstance().getComputerList());

    }
}
