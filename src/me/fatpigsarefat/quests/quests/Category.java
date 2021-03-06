package me.fatpigsarefat.quests.quests;

import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private String id;
    private ItemStack displayItem;
    private List<String> registeredQuestIds = new ArrayList<>();

    public Category(String id, ItemStack displayItem) {
        this.id = id;
        this.displayItem = displayItem;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ItemStack getDisplayItem() {
        return displayItem;
    }

    public void setDisplayItem(ItemStack displayItem) {
        this.displayItem = displayItem;
    }

    public void registerQuestId(String questid) {
        registeredQuestIds.add(questid);
    }

    public List<String> getRegisteredQuestIds() {
        return registeredQuestIds;
    }
}
