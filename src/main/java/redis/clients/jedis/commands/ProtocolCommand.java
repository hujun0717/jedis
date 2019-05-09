package redis.clients.jedis.commands;

@FunctionalInterface
public interface ProtocolCommand {

  byte[] getRaw();

}
