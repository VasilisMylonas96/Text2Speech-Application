package Model;
public interface InterfaceEncode {
	String encode();
}
class AtbaashReturn implements InterfaceEncode{
	public String encode() {
		return"Atbash";
	}
}
class Rot13Return implements InterfaceEncode{
	public String encode() {
		return"Rot13";
	}
}
class UTF implements InterfaceEncode{
	public String encode() {
		return"UTF8";
	}
}

