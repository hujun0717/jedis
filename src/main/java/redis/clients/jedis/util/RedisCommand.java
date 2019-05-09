package redis.clients.jedis.util;

import redis.clients.jedis.commands.ProtocolCommand;

public class RedisCommand implements ProtocolCommand{
	
	byte[] cmdRaw;
	
	public RedisCommand(String cmd) {
		cmdRaw = SafeEncoder.encode(cmd);
	}
	
	@Override
	public byte[] getRaw() {
		
		return new ProtocolCommand() {
			
			@Override
			public byte[] getRaw() {
				// TODO Auto-generated method stub
				return null;
			}
		}.getRaw();
		
	}

}
