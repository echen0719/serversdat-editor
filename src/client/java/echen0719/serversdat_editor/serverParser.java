package echen0719.serversdat_editor;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.ServerList;
import net.minecraft.network.chat.Component;

public class serverParser {
    private Map<Integer, ServerData> servers = new HashMap<>();

    public serverParser() {
        ServerList serverList = new ServerList(Minecraft.getInstance());
        serverList.load();
        
        for (int i = 0; i < serverList.size(); i++) {
            // format of (index, ServerData)
            this.servers.put(i, serverList.get(i));
        }
    }

    private Object[] getData(ServerData serverData) {
        String ip = serverData.ip;

        String name = serverData.name;
        Component motd = serverData.motd;
        List<Component> playerList = serverData.playerList;
        int protocol = serverData.protocol; 
        Component status = serverData.status;
        Component version = serverData.version;

        return new Object[] {}; // Example: IP, Status, Ping
    }
}
