package jp.simplespace.matchanpluginutilities.api.gui.setup;

import jp.simplespace.matchanpluginutilities.api.gui.GuiAction;
import jp.simplespace.matchanpluginutilities.api.gui.GuiElement;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class SetupGuiElement extends GuiElement {
    private String path;
    private boolean complete = false;
    private GuiAction action;

    public SetupGuiElement(ItemStack item,String path,GuiAction action) {
        super(item, action);
        this.path=path;
        this.action=action;
    }

    @Override
    public void action(InventoryClickEvent e) {
        this.action.run(this,e);
    }

    public String getPath(){
        return path;
    }
    public void setPath(String path){
        this.path=path;
    }
    public boolean isComplete(){
        return complete;
    }
    public void setComplete(boolean boo){
        complete=boo;
    }
    public GuiAction getAction(){
        return action;
    }
}
