public class Computer {
	  private CPU cpu;
	  private Memory memory;
	  private HardDrive hardDrive;
	  private Monitor monitor;
	  
	  public Computer() {
		    this.cpu = new CPU();
		    this.memory = new Memory();
		    this.hardDrive = new HardDrive();
		    this.monitor = new Monitor();
		  }

		  public void startComputer() {
		    cpu.freeze();
		    memory.load(3, hardDrive.read(2, 5));
		    cpu.jump(3);
		    cpu.execute();
		  }
		  
}
