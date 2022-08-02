package assignment_Inheritance;

public class Laptop {
	int noOfUSBPorts,processorSpeed;

	public int getNoOfUSBPorts() {
		return noOfUSBPorts;
	}

	public void setNoOfUSBPorts(int noOfUSBPorts) {
		this.noOfUSBPorts = noOfUSBPorts;
	}

	public int getProcessorSpeed() {
		return processorSpeed;
	}

	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}
	
	public String toString()
	{
		return noOfUSBPorts+" "+processorSpeed+" ";
	}

}
