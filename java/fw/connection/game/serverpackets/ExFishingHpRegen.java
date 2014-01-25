package fw.connection.game.serverpackets;

import fw.game.model.ai.L2FishingInfo;

public class ExFishingHpRegen extends L2GameServerPacket {

	private L2FishingInfo _info = null;
	
	@Override
	public void read() {
		int  charObjID = readD();
		if(charObjID != getPlayer().getObjectId()) return;	
		_info = getPlayer().getFishingInfo();		
		_info.time =readD();
		_info.fish_HP =readD();
		_info.HPstop = readC(0);	
	}

	@Override
	public void excecute() {
		_info.setHPRegen(_info.fish_HP);
	}

}
