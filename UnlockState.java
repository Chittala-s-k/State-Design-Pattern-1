package state;

public class UnlockState implements State {
	Door door;
	public UnlockState( Door operator ) {
		this.door = operator;
	}
	public void doorOpen() {
		if (door.checkCondition()) {
			System.out.println("The Door is already open");
			
		}
		else {
			door.setState(door.getCloseState());
			System.out.println("Door is Broken");
		}
	}

	
	public void doorClose() {
		System.out.println("Door is closed");
		door.setState(door.getCloseState());
	}

	
	public void doorLock() {
		if(door.checkCondition()) {
			System.out.println("Door is Locked ");
			door.checkCondition();
			door.setState(door.getLockState());
		}
		else {
			System.out.println("Door is Broken");
			door.setState(door.getCloseState());
			
		}

	}

	
	public void doorUnlock() {
		// TODO Auto-generated method stub
		System.out.println("Door is unlocked");
		

	}


	
	public String toString() {
		return "Door is Unlocked, You can get inside ";
	}

}
