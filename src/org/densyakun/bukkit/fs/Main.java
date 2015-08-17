package org.densyakun.bukkit.fallsound;
import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.plugin.java.JavaPlugin;
public class Main extends JavaPlugin implements Listener {
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
	}
	@EventHandler
	public void EntityDamage(EntityDamageEvent e) {
		if ((e.getEntityType()==EntityType.PLAYER) && (e.getCause()==DamageCause.FALL)) {
			((Player) e.getEntity()).playSound(((Player) e.getEntity()).getLocation(), Sound.HURT, 1, 0);
		}
	}
}
