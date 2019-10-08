
public class HardDrive {
	public byte[] read(long lba, int size) {
		System.out.println("HardDrive");
		return new byte[size];
	}

}
