package service;

import interfaces.InterfaceAccount;
import model.Account;

import java.util.*;

public class ManagerAccount implements InterfaceAccount<Account> {
    private static final ManagerAccount instance = new ManagerAccount();
    private Map<String, Account> listAccount = new TreeMap<>();

    private ManagerAccount() {
    }

    public static ManagerAccount getInstance() {
        return instance;
    }

    @Override
    public void addAccount(Account account) {
        listAccount.put(account.getUserName(), account);
    }

    @Override
    public void update(Account account, String userName) {
        findByUserName(userName).setUserName(account.getUserName());
        findByUserName(userName).setPassWork(account.getPassWork());
    }

    @Override
    public void updateMoney(String name, double money) {
        findByUserName(name).setMoney(money);
    }

    @Override
    public void deleteByName(String userName) {
        listAccount.remove(userName);
    }

    @Override
    public void print() {
        for (Map.Entry<String, Account> account : listAccount.entrySet()) {
            System.out.println(account.getValue());
        }
    }

    public Account findByUserName(String userName) {
        for (int i = 0; i < listAccount.size(); i++) {
            if (listAccount.containsKey(userName)) {
                return listAccount.get(userName);
            }
        }
        return null;
    }
}
