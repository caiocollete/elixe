package elixe.events;

import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.input.Keyboard;

//runTick() : void - net.minecraft.client.Minecraft
//L:1708
public class OnKeyEvent {
	private boolean state;
    private int key;



	public OnKeyEvent(boolean state, int key) {
		super();
		this.state = state;
		this.key = key;
	}

	public boolean isState() {
		return state;
	}
	public int getKey() {
		return key;
	}

	public boolean isPressed() {
		return Keyboard.isKeyDown(this.key);
	}
}