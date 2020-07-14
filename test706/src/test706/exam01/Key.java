package test706.exam01;

public class Key {
	public int number;
	public Key(int number) {
		this.number = number;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key comKey = (Key) obj;
			if(this.number == comKey.number) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return number;
	}
}
