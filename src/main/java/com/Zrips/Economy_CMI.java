package com.Zrips;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Economy.Economy;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import net.milkbowl.vault.economy.AbstractEconomy;
import net.milkbowl.vault.economy.EconomyResponse;
import net.milkbowl.vault.economy.EconomyResponse.ResponseType;
import org.bukkit.OfflinePlayer;
import org.bukkit.plugin.Plugin;

public class Economy_CMI extends AbstractEconomy {
    public CMI cmi;
    private final EconomyResponse ecoResponse;

    public Economy_CMI() {
        this.ecoResponse = new EconomyResponse(0.0D, 0.0D, ResponseType.NOT_IMPLEMENTED, "CMI currently don't support bank's");
    }

    public void setCMI(CMI cmi) {
        this.cmi = cmi;
    }

    public boolean isEnabled() {
        return this.cmi != null;
    }

    public String getName() {
        return "CMIEconomy";
    }

    public String format(double amount) {
        return Economy.format(amount);
    }

    public String currencyNameSingular() {
        return "";
    }

    public String currencyNamePlural() {
        return "";
    }

    public double getBalance(String playerName) {
        return Economy.getBalance(playerName);
    }

    public double getBalance(OfflinePlayer offlinePlayer) {
        return Economy.getBalance(offlinePlayer);
    }

    public EconomyResponse withdrawPlayer(String playerName, double amount) {
        return Economy.withdrawPlayer(playerName, amount);
    }

    public EconomyResponse withdrawPlayer(OfflinePlayer offlinePlayer, double amount) {
        return Economy.withdrawPlayer(offlinePlayer, amount);
    }

    public EconomyResponse depositPlayer(String playerName, double amount) {
        return Economy.depositPlayer(playerName, amount);
    }

    public EconomyResponse depositPlayer(OfflinePlayer offlinePlayer, double amount) {
        return Economy.depositPlayer(offlinePlayer, amount);
    }

    public boolean has(String playerName, double amount) {
        return Economy.has(playerName, amount);
    }

    public boolean has(OfflinePlayer offlinePlayer, double amount) {
        return this.getBalance(offlinePlayer) >= amount;
    }

    public EconomyResponse createBank(String name, String player) {
        return this.ecoResponse;
    }

    public EconomyResponse createBank(String name, OfflinePlayer offlinePlayer) {
        return this.ecoResponse;
    }

    public EconomyResponse deleteBank(String name) {
        return this.ecoResponse;
    }

    public EconomyResponse bankHas(String name, double amount) {
        return this.ecoResponse;
    }

    public EconomyResponse bankWithdraw(String name, double amount) {
        return this.ecoResponse;
    }

    public EconomyResponse bankDeposit(String name, double amount) {
        return this.ecoResponse;
    }

    public EconomyResponse isBankOwner(String name, String playerName) {
        return this.ecoResponse;
    }

    public EconomyResponse isBankOwner(String name, OfflinePlayer offlinePlayer) {
        return this.ecoResponse;
    }

    public EconomyResponse isBankMember(String name, String playerName) {
        return this.ecoResponse;
    }

    public EconomyResponse isBankMember(String name, OfflinePlayer offlinePlayer) {
        return this.ecoResponse;
    }

    public EconomyResponse bankBalance(String name) {
        return this.ecoResponse;
    }

    public List<String> getBanks() {
        return new ArrayList();
    }

    public boolean hasBankSupport() {
        return false;
    }

    public boolean hasAccount(String playerName) {
        return true;
    }

    public boolean hasAccount(OfflinePlayer offlinePlayer) {
        return true;
    }

    public boolean createPlayerAccount(String playerName) {
        return Economy.createPlayerAccount(playerName);
    }

    public boolean createPlayerAccount(OfflinePlayer offlinePlayer) {
        return Economy.createPlayerAccount(offlinePlayer);
    }

    public int fractionalDigits() {
        return -1;
    }

    public boolean hasAccount(String playerName, String worldName) {
        return this.hasAccount(playerName);
    }

    public boolean hasAccount(OfflinePlayer offlinePlayer, String worldName) {
        return this.hasAccount(offlinePlayer);
    }

    public double getBalance(String playerName, String worldName) {
        return this.getBalance(playerName);
    }

    public double getBalance(OfflinePlayer offlinePlayer, String worldName) {
        return this.getBalance(offlinePlayer);
    }

    public boolean has(String playerName, String worldName, double amount) {
        return this.has(playerName, amount);
    }

    public boolean has(OfflinePlayer offlinePlayer, String worldName, double amount) {
        return this.has(offlinePlayer, amount);
    }

    public EconomyResponse withdrawPlayer(String playerName, String worldName, double amount) {
        return this.withdrawPlayer(playerName, amount);
    }

    public EconomyResponse withdrawPlayer(OfflinePlayer offlinePlayer, String worldName, double amount) {
        return this.withdrawPlayer(offlinePlayer, amount);
    }

    public EconomyResponse depositPlayer(String playerName, String worldName, double amount) {
        return this.depositPlayer(playerName, amount);
    }

    public EconomyResponse depositPlayer(OfflinePlayer offlinePlayer, String worldName, double amount) {
        return this.depositPlayer(offlinePlayer, amount);
    }

    public boolean createPlayerAccount(String playerName, String worldName) {
        return this.createPlayerAccount(playerName);
    }

    public boolean createPlayerAccount(OfflinePlayer offlinePlayer, String worldName) {
        return this.createPlayerAccount(offlinePlayer);
    }
}
