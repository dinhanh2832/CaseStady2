package service;

import interfaces.InterfaceComputer;
import model.Computer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManagerComputer implements InterfaceComputer<Computer> {
    private static final ManagerComputer instance = new ManagerComputer();
    private final List<Computer> computerList = new ArrayList<>();
    private int count = 0;

    private ManagerComputer() {
    }

    public static ManagerComputer getInstance() {
        return instance;
    }

    public List<Computer> getComputerList() {
        return computerList;
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < computerList.size(); i++) {
            if (computerList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void addComputer(Computer computer) {
        computer.setId(count);
        count++;
        computerList.add(computer);

    }

    @Override
    public void update(Computer computer, int id) {
        int index = findIndexById(id);
        computerList.set(index, computer);
    }

    @Override
    public void deleteById(int id) {
        int index = findIndexById(id);
        computerList.remove(index);
    }

    @Override
    public void print() {
        for (Computer computer : computerList) {
            System.out.println(computer);
        }
    }
    public static void writeToFile(String path, List<Computer> computerList){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(computerList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  List<Computer> readDataFromFile(String path){
        List<Computer> computers = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            computers = (List<Computer>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return computers;
    }
}
